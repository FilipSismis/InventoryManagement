package db;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import model.CompanySupplier;
import model.PersonSupplier;
import model.Supplier;

public class SupplierDB implements SupplierDBIF {
	private AddressDB addressDB;
	
	public SupplierDB() {
		addressDB = new AddressDB();
	}

	public Supplier findSupplierByEmail(String supplierEmail) {
		Supplier supplier = null;
		String queryString = "select * from Supplier where email = ?";
		int supplierId = 0;
		try(PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(queryString)) {
			pstmt.setString(1, supplierEmail);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				supplierId = rs.getInt("id");
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String supplierQueryString = "select * from CompanySupplier where supplierId = ? union " + 
				"select * from PersonSupplier where supplierId = ?";
		try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(supplierQueryString)){
			pstmt.setInt(1, supplierId);
			pstmt.setInt(2, supplierId);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			if(rsmd.getColumnLabel(3).equals("sName")){
				supplier = buildCompanySupplier(rs);
				supplier.setEmail(supplierEmail);
				supplier.setId(supplierId);
			}else if(rsmd.getColumnLabel(3).equals("fName")) {
				supplier = buildPersonSupplier(rs);
				supplier.setEmail(supplierEmail);
				supplier.setId(supplierId);
			}
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return supplier;
	}
	
	private void addSupplier(Supplier supplier) {
		String insertString = "insert Supplier (email) values(?)";
		try(PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(insertString, 
				Statement.RETURN_GENERATED_KEYS)) {
			pstmt.setString(1, supplier.getEmail());
			
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				supplier.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addCompanySupplier(CompanySupplier companySupplier) {
		addSupplier(companySupplier);
		addressDB.addAddress(companySupplier);
		
		String insertString = "insert CompanySupplier (supplierId, sName, phone, addressId) values(?, ?, ?, ?)";
		try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(insertString)){
			pstmt.setInt(1, companySupplier.getId());
			pstmt.setString(2, companySupplier.getsName());
			pstmt.setString(3, companySupplier.getPhoneNo());
			pstmt.setInt(4, companySupplier.getAddressId());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void addPersonSupplier(PersonSupplier personSupplier) {
		addSupplier(personSupplier);
		
		String insertString = "insert PersonSupplier (supplierId, fName, lName, noOfDonations) values(?, ?, ?, ?)";
		try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(insertString)){
			pstmt.setInt(1, personSupplier.getId());
			pstmt.setString(2, personSupplier.getfName());
			pstmt.setString(3, personSupplier.getlName());
			pstmt.setInt(4, personSupplier.getNoOfDonations());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteSupplier(String supplierEmail) {
		String deleteString = "delete from Supplier where email = ?";
		try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(deleteString)){
			pstmt.setString(1, supplierEmail);
			
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private Supplier buildCompanySupplier(ResultSet rs){
		Supplier supplier = null;
		try {
			if(rs.next()) {
				addressDB.getFullAddressByAddresId(rs.getInt("addressId"));
				supplier = new CompanySupplier(rs.getString("sName"), rs.getString("phone"), addressDB.getAddress(), 
						addressDB.getZip(), addressDB.getCity());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return supplier;
	}
	
	private Supplier buildPersonSupplier(ResultSet rs) {
		Supplier supplier = null;
		try {
			if(rs.next()) {
				supplier = new PersonSupplier(rs.getString("fName"), rs.getString("lName"), rs.getInt("noOfDonations"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return supplier;
	}

	public Supplier findSupplierById(int id) {
		Supplier supplier = null;	
		String supplierEmail = null;
		
		String queryString = "select * from Supplier where id = ?";
		try(PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(queryString)) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				supplierEmail = rs.getString("email");
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String supplierQueryString = "select * from CompanySupplier where supplierId = ? union " + 
				"select * from PersonSupplier where supplierId = ?";
		try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(supplierQueryString)){
			pstmt.setInt(1, id);
			pstmt.setInt(2, id);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			if(rsmd.getColumnLabel(3).equals("sName")){
				supplier = buildCompanySupplier(rs);
				supplier.setEmail(supplierEmail);
				supplier.setId(id);
			}else if(rsmd.getColumnLabel(3).equals("fName")) {
				supplier = buildPersonSupplier(rs);
				supplier.setEmail(supplierEmail);
				supplier.setId(id);
			}
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return supplier;
	}
}
