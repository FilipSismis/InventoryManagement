package db;


import java.util.ArrayList;

import model.Accessory;
import model.Clothing;
import model.Product;

public interface ProductDBIF {
	void addAccessory(Accessory accessory);
	void addClothing(Clothing clothing);
	void deleteProduct(String pName);
	ArrayList<Product> getProductList(String filter, String filterParam);
	Product getProductByPName(String pName);
	void updateProduct(String pName, String filter, String filterParam);
}
