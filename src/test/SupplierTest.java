package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import control.SupplierControl;
import model.Supplier;

class SupplierTest {
	
	SupplierControl supCtrl;
	
	@BeforeEach
	void setUp() {
		supCtrl = new SupplierControl();
	}

	

	@Test
	void testAddCompanySupplier() {
		Supplier supplier = null;
		supCtrl.addCompanySupplier("testSupp1@gmail.com", "testSupp1", "12345678", "test address 1", "1234", "test city1");
		supplier = supCtrl.findSupplierByEmail("testSupp1@gmail.com");
		assertNotNull(supplier, "Supplier was created and found in DB");
	}
	
	@Test
	void testAddPersonSupplier() {
		Supplier supplier = null;
		supCtrl.addPersonSupplier("testSupp2@gmail.com", "test2", "Supp2", 0);
		supplier = supCtrl.findSupplierByEmail("testSupp2@gmail.com");
		assertNotNull(supplier, "Supplier was created and found in DB");
	}
	
	@AfterEach
	void cleanUp() {
		supCtrl.deleteSupplier("testSupp1@gmail.com");
		supCtrl.deleteSupplier("testSupp2@gmail.com");
	}
	
}
