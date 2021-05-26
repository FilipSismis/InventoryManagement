package control;

import model.Accessory;
import model.Clothing;
import model.Product;
import model.Supplier;

import java.util.ArrayList;

import db.ProductDB;
import db.ProductDBIF;
import db.ProductTypeDB;
import db.ProductTypeDBIF;

public class ProductControl {
	ProductDBIF productDB;
	ProductTypeDBIF productTypeDB;
	SupplierControl supplierControl;
	
	public ProductControl() {
		productDB = new ProductDB();
		productTypeDB = new ProductTypeDB();
		supplierControl = new SupplierControl();
	}
	
	public void addClothing(String pName, String colour, boolean discount, String description, String productType, String supplierEmail, String size, String gender) {
		Supplier supplier = supplierControl.findSupplierByEmail(supplierEmail);
		Clothing clothing = new Clothing(pName, colour, discount, description, productType, supplier, size, gender);
		productTypeDB.getProductTypeInfo(clothing);
		productDB.addClothing(clothing);
	}
	
	public void addAccessory(String pName, String colour, boolean discount, String description, String productType, String supplierEmail, String material) {
		Supplier supplier = supplierControl.findSupplierByEmail(supplierEmail);
		Accessory accessory = new Accessory(pName, colour, discount, description, productType, supplier, material);
		productTypeDB.getProductTypeInfo(accessory);
		productDB.addAccessory(accessory);
	}
	
	public void deleteProduct(String pName) {
		productDB.deleteProduct(pName);
	}
	
	public ArrayList<Product> getProductList(String filter, String filterParam) {
		ArrayList<Product> productList = new ArrayList<>();
		productList = productDB.getProductList(filter, filterParam);
		return productList;
	}
	
	public Product getProductByPName(String pName) {
		return productDB.getProductByPName(pName);
	}

	public void updateProduct(String pName, String filter, String filterParam) {
		productDB.updateProduct(pName, filter, filterParam);
	}
	
}
