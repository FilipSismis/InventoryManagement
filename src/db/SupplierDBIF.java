package db;

import model.Supplier;
import model.CompanySupplier;
import model.PersonSupplier;

public interface SupplierDBIF {

	Supplier findSupplierByEmail(String supplierEmail);
	void addCompanySupplier(CompanySupplier companySupplier);
	void addPersonSupplier(PersonSupplier personSupplier);
	void deleteSupplier(String supplierEmail);
}
