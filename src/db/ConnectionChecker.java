package db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JLabel;

public class ConnectionChecker extends Thread{
	private JLabel lblConnection;
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
				lblConnection.setText("Connection status: Database connection is opened");
			}else {
				lblConnection.setText("Connection status: Database connection is closed");
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void setLblConnection(JLabel lblConnection) {
		this.lblConnection = lblConnection;
	}

}
