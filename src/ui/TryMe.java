package ui;

import control.*;

public class TryMe {
	private ProductControl pCtrl;
	private SupplierControl sCtrl;
	
	public static void main(String[] args) {
		TryMe mm = new TryMe();
		mm.deleteProduct();
	}
	
	public TryMe() {
		pCtrl = new ProductControl();
		sCtrl = new SupplierControl();
	}
	
	public void addProduct(){
		pCtrl.addAccessory("handbag2", "brown", true, "good condition, no damage", "handbag", "supplier1@gmail.com", "leather");
		pCtrl.addClothing("tshirt3", "black", false, "little tear at the bottom of the shirt", "shirt", "supplier3@gmail.com", "M", "male");	
		System.out.println("accessory has been added to database");
			
	}
	
	public void deleteProduct() {
		pCtrl.deleteProduct("test2");
		pCtrl.deleteProduct("test1");
		System.out.println("handbag was deleted");
	}
	
	public void addSupplier() {
		sCtrl.addCompanySupplier("supplier5@gmail.com", "supplier5", "452365412", "street name nr. 5", "9258", "city5");
		sCtrl.addPersonSupplier("supplier6@gmail.com", "Tony", "Adams", 0);
		System.out.println("suppliers have been added to database");
	}
	
	public void getProductList() {
		pCtrl.getProductList("", "");
	}
	
	public void deleteSupplier() {
		sCtrl.deleteSupplier("testSupp1@gmail.com");
		sCtrl.deleteSupplier("testSupp2@gmail.com");
	}
	
	public void updateProduct() {
		pCtrl.updateProduct("handbag2", "discount", "true");
	}
	
	public void getProduct() {
		System.out.println("" + pCtrl.getProductByPName("handbag2").isDiscounted());
	}
}
