package test;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import org.junit.After;
import org.junit.jupiter.api.Test;
import db.ConnectionDB;

class ConnectionTest {
	
		
	@Test
	void testDatabaseConnection() {
		assertNotNull(ConnectionDB.getInstance().getConnection(), "Connected - connection can not be null");
	}
	
	@Test
	void testConnectionValidity() throws SQLException {
		boolean valid;
		valid = ConnectionDB.getInstance().getConnection().isValid(5);
		assertTrue(valid, "True - connection to DB is valid");
	}
	
	@After
	void cleanUp() {
		ConnectionDB.getInstance().disconnect();
	}
}
