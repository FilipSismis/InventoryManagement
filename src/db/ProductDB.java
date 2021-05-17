package db;

import model.Accessory;
import model.Clothing;
import model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDB implements ProductDBIF{
	ProductTypeDB productTypeDB;
	SupplierDB supplierDB;
	public ProductDB() {
		productTypeDB = new ProductTypeDB();
		supplierDB = new SupplierDB();
	}
	
	public void addAccessory(Accessory accessory) {
		String insertString = "insert Product " + 
				"(pName, supplierId, productTypeId, colour, discount, description, productCategory, material) " +
				"values(?, ?, ?, ?, ?, ?, ?, ?)";
		
		try (PreparedStatement insertAccessory = ConnectionDB.getInstance().getConnection().prepareStatement(insertString)){
			insertAccessory.setString(1, accessory.getpName());
			insertAccessory.setInt(2, accessory.getSupplier().getId());
			insertAccessory.setInt(3, accessory.getProductTypeId());
			insertAccessory.setString(4, accessory.getColour());
			insertAccessory.setBoolean(5, accessory.isDiscounted());
			insertAccessory.setString(6, accessory.getDescription());
			insertAccessory.setString(7, "Accessory");
			insertAccessory.setString(8, accessory.getMaterial());
			
			insertAccessory.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void addClothing(Clothing clothing) {
		String insertString = "insert Product " + 
				"(pName, supplierId, productTypeId, colour, discount, description, productCategory, size, gender) " +
				"values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try (PreparedStatement insertClothing = ConnectionDB.getInstance().getConnection().prepareStatement(insertString)){
			insertClothing.setString(1, clothing.getpName());
			insertClothing.setInt(2, clothing.getSupplier().getId());
			insertClothing.setInt(3, clothing.getProductTypeId());
			insertClothing.setString(4, clothing.getColour());
			insertClothing.setBoolean(5, clothing.isDiscounted());
			insertClothing.setString(6, clothing.getDescription());
			insertClothing.setString(7, "Clothing");
			insertClothing.setString(8, clothing.getSize());
			insertClothing.setString(9, clothing.getGender());
			
			insertClothing.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Product> getProductList(String filter, String filterParam){
		ArrayList<Product> productList = new ArrayList<>();
		
		if(filter.equals(null)) {
			String queryProducts = "select * from Product";
			try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(queryProducts)){
				ResultSet rs = pstmt.executeQuery();
				productList = buildProductlist(rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {	
			String queryProducts = "select * from Product where ? = ?";
			try (PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(queryProducts)){
				pstmt.setString(1, filter);
				pstmt.setString(2, filterParam);	
			
				ResultSet rs = pstmt.executeQuery();
				productList = buildProductlist(rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return productList;
	}
	
	private ArrayList<Product> buildProductlist(ResultSet rs) {
		ArrayList<Product> productList = new ArrayList<>();
		
		try {
			while(rs.next()) {
				Product product = buildProduct(rs);
				productList.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
	}

	private Product buildProduct(ResultSet rs) {
		Product product = null;
		try {
			if(rs.getString("productCategory").equals("Accessory")) {
				product = new Accessory(rs.getString("pName"), rs.getString("colour"), rs.getBoolean("discount"),
						rs.getString("description"), productTypeDB.findProductTypeById(rs.getInt("productTypeId")),
						supplierDB.findSupplierById(rs.getInt("supplierId")), rs.getString("material"));
			}else {
				product = new Clothing(rs.getString("pName"), rs.getString("colour"), rs.getBoolean("discount"),
						rs.getString("description"), productTypeDB.findProductTypeById(rs.getInt("productTypeId")),
						supplierDB.findSupplierById(rs.getInt("supplierId")), rs.getString("size"), rs.getString("gender"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return product;
	}

	public void deleteProduct(String pName) {
		String deleteString = "delete from Product where pName = ?";
		
		try (PreparedStatement deleteProduct = ConnectionDB.getInstance().getConnection().prepareStatement(deleteString)){
			deleteProduct.setString(1, pName);
			
			deleteProduct.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
