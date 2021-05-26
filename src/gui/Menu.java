package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import java.awt.CardLayout;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLayeredPane layeredPane1;
	private JPanel saleOrderPanel;
	private JPanel test4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPanel productPanel;
	private JPanel supplierPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels(JPanel panel) {
		layeredPane1.removeAll();
		layeredPane1.add(panel);
		layeredPane1.repaint();
		layeredPane1.revalidate();
	}
	
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane1 = new JLayeredPane();
		layeredPane1.setBounds(10, 57, 416, 196);
		contentPane.add(layeredPane1);
		layeredPane1.setLayout(new CardLayout(0, 0));
		
		saleOrderPanel = new JPanel();
		layeredPane1.add(saleOrderPanel, "name_223784158941200");
		saleOrderPanel.setLayout(null);
		
		lblNewLabel = new JLabel("ORDER");
		lblNewLabel.setBounds(136, 56, 125, 34);
		saleOrderPanel.add(lblNewLabel);
		
		productPanel = new JPanel();
		layeredPane1.add(productPanel, "name_223784172008200");
		productPanel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("PRODUCT");
		lblNewLabel_1.setBounds(163, 79, 87, 29);
		productPanel.add(lblNewLabel_1);
		
		supplierPanel = new JPanel();
		layeredPane1.add(supplierPanel, "name_223784185487500");
		supplierPanel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("SUPPLIER");
		lblNewLabel_2.setBounds(157, 78, 80, 22);
		supplierPanel.add(lblNewLabel_2);
		
		test4 = new JPanel();
		layeredPane1.add(test4, "name_223784198099800");
		test4.setLayout(null);
		
		lblNewLabel_3 = new JLabel("TEST");
		lblNewLabel_3.setBounds(125, 64, 151, 41);
		test4.add(lblNewLabel_3);
		
		
		// Buttons
		
		
		JButton saleOrderB = new JButton("Order");
		saleOrderB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(saleOrderPanel);
			}

		});
		saleOrderB.setBounds(0, 10, 85, 21);
		contentPane.add(saleOrderB);

		
		JButton productB = new JButton("Product");
		productB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(productPanel);
			}

		});
		productB.setBounds(95, 10, 85, 21);
		contentPane.add(productB);
		
		JButton supplerB = new JButton("Supplier");
		supplerB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(supplierPanel);
			}

		});
		supplerB.setBounds(190, 10, 85, 21);
		contentPane.add(supplerB);
		
		JButton test4B = new JButton("test4B");
		test4B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(test4);
			}

		});
		test4B.setBounds(285, 10, 85, 21);
		contentPane.add(test4B);
	}
}