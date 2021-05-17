package control;

import model.Accessory;
import model.Clothing;
import model.Supplier;
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
	
}
