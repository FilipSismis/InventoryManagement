package control;

import db.SupplierDB;
import db.SupplierDBIF;
import model.Supplier;
import model.CompanySupplier;
import model.PersonSupplier;

public class SupplierControl {
	private SupplierDBIF supplierDB;
	
	public SupplierControl() {
		supplierDB = new SupplierDB();
	}

	public Supplier findSupplierByEmail(String supplierEmail) {
		Supplier supplier = null;
		supplier = supplierDB.findSupplierByEmail(supplierEmail);
		return supplier;
	}
	
	public void addCompanySupplier(String supplierEmail, String sName, String phone, String address, String zipCode, String city) {
		CompanySupplier companySupplier;
		companySupplier = new CompanySupplier(sName, phone, address, zipCode, city);
		companySupplier.setEmail(supplierEmail);
		supplierDB.addCompanySupplier(companySupplier);
	}
	
	public void addPersonSupplier(String supplierEmail, String fName, String lName, int noOfDonations) {
		PersonSupplier personSupplier;
		personSupplier = new PersonSupplier(fName, lName, noOfDonations);
		personSupplier.setEmail(supplierEmail);
		supplierDB.addPersonSupplier(personSupplier);
	}

}
