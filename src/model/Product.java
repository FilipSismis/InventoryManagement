package model;

public class Product {
	
	private String pName;
	private String colour;
	private boolean discount;
	private String description;
	private Supplier supplier;
	private String productType;
	private int productTypeId;
	private float price;
	private int productId;
	private int saleOrderId;
	private boolean sold;
	
	public Product(String pName, String colour, boolean discount, String description, String productType, Supplier supplier) {
		this.pName = pName;
		this.colour = colour; 
		this.discount = discount;
		this.description = description;
		this.productType = productType;
		this.supplier = supplier;
		this.sold = false;
	}

	public String getPName() {
		return pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isDiscounted() {
		return discount;
	}

	public void setDiscount(boolean discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public int getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(int productTypeId) {
		this.productTypeId = productTypeId;
	}

	public float getPrice() {
		if(isDiscounted()) {
			return price/2;
		}else {
			return price;
		}
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getSaleOrderId() {
		return saleOrderId;
	}

	public void setSaleOrderId(int saleOrderId) {
		this.saleOrderId = saleOrderId;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}
		
}
