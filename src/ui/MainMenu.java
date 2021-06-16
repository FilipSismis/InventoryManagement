package ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

public class MainMenu {

	private JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainMenu() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1184, 655);
		frame.getContentPane().add(tabbedPane);
		
		JPanel productMenuPanel = new ProductMenu();
		tabbedPane.addTab("Product Menu", null, productMenuPanel, null);
		productMenuPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel supplierMenuPanel = new SupplierMenu();
		tabbedPane.addTab("Supplier Menu", null, supplierMenuPanel, null);
		
		JPanel saleOrderPanel = new SaleOrderMenu();
		tabbedPane.addTab("Sale Order Menu", null, saleOrderPanel, null);
		
		JPanel connectionCheckerPanel = new ConnectionCheckerPanel();
		connectionCheckerPanel.setBounds(10, 655, 1184, 26);
		frame.getContentPane().add(connectionCheckerPanel);
		
	}
}
