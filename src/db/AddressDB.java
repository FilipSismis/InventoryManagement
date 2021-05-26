package db;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.CompanySupplier;

public class AddressDB{
	
	private String address;
	private String zip;
	private String city;
	
	public AddressDB() {
	}

	public String getAddress() {
		return address;
	}

	public String getZip() {
		return zip;
	}

	public String getCity() {
		return city;
	}
	
	//first call this method which assigns values to the class variable than you can call 
	//getters of the variables to get the values out of DB  
	
	public void getFullAddressByAddresId(int addressId) throws SQLException {
		String sql = String.format("select * from Address where id = %d",addressId);
		try(Statement s = ConnectionDB.getInstance().getConnection().createStatement()) {
			ResultSet rs = s.executeQuery(sql);
			if(rs.next()) {
			address = rs.getString("addressLine");
			getZipById(rs.getInt("zipcodeId"));
			}
			rs.close();
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public void addAddress(CompanySupplier companySupplier) {
		int zipId = addZipLocation(companySupplier);
		companySupplier.setAddressId(0);
		String queryAddress = "select * from Address where addressLine = ?";
		try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(queryAddress)){
			pstmt.setString(1, companySupplier.getAddress());
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				companySupplier.setAddressId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(companySupplier.getAddressId() == 0) {
			String insertAddress = "insert Address (addressLine, zipcodeId) values(?, ?)";
			try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(insertAddress, Statement.RETURN_GENERATED_KEYS)){
				pstmt.setString(1, companySupplier.getAddress());
				pstmt.setInt(2, zipId);
				
				pstmt.executeUpdate();
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					companySupplier.setAddressId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private int addZipLocation(CompanySupplier companySupplier) {
		int zipId = 0;
		
		String queryForZipLocation = "select * from ZipLocation where zipcode = ?";
		try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(queryForZipLocation)){
			pstmt.setInt(1, Integer.parseInt(companySupplier.getZipCode()));
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				zipId = rs.getInt("id");
			}
		} catch (SQLException e) {
			System.out.println("No zip found");
		}
		
		if(zipId == 0) {
			String insertZipLocation = "insert ZipLocation (zipcode, city) values(?, ?)";
			try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(insertZipLocation, Statement.RETURN_GENERATED_KEYS)){
				pstmt.setInt(1, Integer.parseInt(companySupplier.getZipCode()));
				pstmt.setString(2, companySupplier.getCity());
			
				pstmt.executeUpdate();
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					zipId = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return zipId;
	}
	
	private void getZipById(int zipcodeId)throws SQLException{
		String sql = String.format("select * from ZipLocation where id = %d",zipcodeId);
		try(Statement s = ConnectionDB.getInstance().getConnection().createStatement()) {
			ResultSet rs = s.executeQuery(sql);
			if(rs.next()) {
			zip = "" + rs.getInt("zipcode");
			city = (rs.getString("city"));
			}
			rs.close();
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}	
}