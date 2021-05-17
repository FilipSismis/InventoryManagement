package db;

import model.Accessory;
import model.Clothing;

public interface ProductDBIF {
	void addAccessory(Accessory accessory);
	void addClothing(Clothing clothing);
	void deleteProduct(String pName);
}
