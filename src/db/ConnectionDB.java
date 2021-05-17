package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private Connection connection;
	private static ConnectionDB dbConnection;
	
	private static final String dbName = "InventoryManagementDB";
	private static final String serverName = "localhost";
	private static final String instanceName = "SQLEXPRESS";
	private static final String portNumber = "1433";
	
	private ConnectionDB() {
		String urlString = String.format("jdbc:sqlserver://%s\\%s:%s;databaseName=%s", 
				serverName, instanceName, portNumber, dbName) ;
	
		String userName = "sa";
		String password = "Hz94A2=4M31i";
		
		try {
			connection = DriverManager.getConnection(urlString, userName,  password);
		} catch (SQLException e) {
			System.err.println("Could not connect to database ");
			System.out.println("URl string was: " + urlString);
			e.printStackTrace();
		}

	}
	
	public static ConnectionDB getInstance() {
		if(dbConnection == null) {
			dbConnection = new ConnectionDB();
		}
		return dbConnection;
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void disconnect() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static String getDBName() {
		return dbName;
	}
}
