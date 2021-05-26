package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import control.ProductControl;
import model.Product;
@TestMethodOrder(OrderAnnotation.class)
class ProductTest {

	ProductControl prCtrl;
	
	@BeforeEach
	void setUp() {
		prCtrl = new ProductControl();
	}
	
	@Test
	@Order(1)
	void testAddClothing() {
		System.out.println("test 1 started");
		Product product = null;
		prCtrl.addClothing("test1", "black", false, "description of product", 
				"shirt", "supplier1@gmail.com", "M", "male");
		product = prCtrl.getProductByPName("test1");
		assertNotNull(product, "Product was created and found in DB");
		System.out.println("test 1 ended");
	}
	
	@Test
	@Order(2)
	void testAddAccessory() {
		System.out.println("test 2 started");
		Product product = null;
		prCtrl.addAccessory("test2", "brown", true, "description of product",
				"handbag", "supplier1@gmail.com", "leather");
		product = prCtrl.getProductByPName("test2");
		assertNotNull(product, "Product was created and found in DB");
		System.out.println("test 2 ended");
	}
	
	@Test
	void testUpdateProduct() {
		System.out.println("test 3 started");
		Product product = null;
		prCtrl.updateProduct("test1", "colour", "white");
		product = prCtrl.getProductByPName("test1");
		assertEquals("white", product.getColour(), "Expected white colour after update");
		System.out.println("test 3 ended");
	}
	
	@Test
	void testUpdateBooleanInProduct() {
		System.out.println("test 4 started");
		Product product = null;
		prCtrl.updateProduct("test1", "sold", "true");
		product = prCtrl.getProductByPName("test1");
		System.out.println(product.getPName());
		assertEquals(true, product.isSold(), "Expected value is true after update");
		System.out.println("test 4 ended");
	}
	
	@Test
	void testUpdateIntInProduct() {
		System.out.println("test 5 started");
		Product product = null;
		prCtrl.updateProduct("test1", "productTypeId", "pants");
		product = prCtrl.getProductByPName("test1");
		assertEquals("pants", product.getProductType(), "Expected value is pants after update");
		System.out.println("test 5 ended");
	}
	
	@AfterAll
	static void cleanUp() {
		System.out.println("clean up started");
		ProductControl prCtrl = new ProductControl();
		prCtrl.deleteProduct("test1");
		prCtrl.deleteProduct("test2");
	}

}
