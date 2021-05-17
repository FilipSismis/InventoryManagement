package model;

public class CompanySupplier extends Supplier{
	private String sName;
	private String phoneNo;
	private String address;
	private String zipCode;
	private String city;
	private int addressId;
	
	public CompanySupplier(String sName, String phoneNo, String address, String zipCode, String city) {
		super();
		this.sName = sName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAddressId() {
		return addressId;
	}
	
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	
	
}
