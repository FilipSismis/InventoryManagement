package db;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionChecker extends Thread{
	
	public void run() {
		Connection connection = ConnectionDB.getInstance().getConnection();
		boolean valid = false;
		while(true) {
			try {
				valid = connection.isValid(2);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			if(valid) {
				System.out.println("DB is connected");
			}else {
				System.out.println("DB is NOT connected");
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
