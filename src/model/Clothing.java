package model;

public class Clothing extends Product{
	private String size;
	private String gender;
	
	public Clothing(String pName, String colour, boolean discount, String description, String productType, Supplier supplier, String size, String gender) {
		super(pName, colour, discount, description, productType, supplier);
		this.size = size;
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
