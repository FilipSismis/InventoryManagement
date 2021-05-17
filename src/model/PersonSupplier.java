package model;

public class PersonSupplier extends Supplier{
	private String fName;
	private String lName;
	private int noOfDonations;
	
	public PersonSupplier(String fName, String lName, int noOfDonations) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.noOfDonations = noOfDonations;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getNoOfDonations() {
		return noOfDonations;
	}

	public void setNoOfDonations(int noOfDonations) {
		this.noOfDonations = noOfDonations;
	}
	
	
}
