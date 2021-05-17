package model;

public class Accessory extends Product{
	private String material;

	public Accessory(String pName, String colour, boolean discount, String description, String productType, Supplier supplier, String material) {
		super(pName, colour, discount, description, productType, supplier);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
