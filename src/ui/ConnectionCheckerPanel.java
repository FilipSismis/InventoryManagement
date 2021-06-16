package ui;

import javax.swing.JPanel;

import db.ConnectionChecker;

import java.awt.BorderLayout;
import javax.swing.JLabel;

public class ConnectionCheckerPanel extends JPanel {

	public ConnectionCheckerPanel() {
		setLayout(new BorderLayout(0, 0));
		JLabel lblConnection = new JLabel("Connection status:");
		add(lblConnection, BorderLayout.CENTER);
		ConnectionChecker connectionChecker = new ConnectionChecker();
		connectionChecker.setLblConnection(lblConnection);
		connectionChecker.start();
	}

}
