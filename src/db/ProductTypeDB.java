package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Product;

public class ProductTypeDB implements ProductTypeDBIF{
	
	public ProductTypeDB() {
	}
	
	public void getProductTypeInfo(Product product) {
		String queryString = "select * from ProductType where productType = ?";
		try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(queryString)) {
			pstmt.setString(1, product.getProductType());
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				product.setProductTypeId(rs.getInt("id"));
				product.setPrice(rs.getFloat("price"));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String findProductTypeById(int id) {
		String productType = null;
		
		String queryString = "select * from ProductType where id = ?";
		try(PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(queryString)){
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				productType = rs.getString("productType");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productType;
	}
}
