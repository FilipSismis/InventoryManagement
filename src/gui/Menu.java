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
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLayeredPane layeredPane2;
	private JPanel saleOrderPanel;
	private JPanel test4;
	private JLabel lblNewLabel_3;
	private JPanel AccessoryPanel;
	private JPanel supplierCompPanel;
	private JLabel lblNewLabel_1;
	private JTextField emailComp;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnNewButton;
	private JButton supplierIndB;
	private JPanel supplierIndPanel;
	private JLabel email_2;
	private JLabel lblFName_1;
	private JLabel lblLName_1;
	private JLabel lblNumberOfDonations_1;
	private JButton btnNewButton_3;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_2_1;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_4;
	private JLabel lblNewLabel_2_5;
	private JLabel lblNewLabel_2_6;
	private JLabel lblNewLabel_2_7;
	private JLabel lblNewLabel_2_8;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_24;
	private JTextField textField_29;
	private JTable accessoryTable;
	private JTable ClothingTable;
	private JTable indSuppTable;
	private JTable compSuppTable;
	private JTextField textField_5;
	private JTable table;

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
	
	public void switchPanels2(JPanel panel) {
		layeredPane2.removeAll();
		layeredPane2.add(panel);
		layeredPane2.repaint();
		layeredPane2.revalidate();
	}
	
	
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane2 = new JLayeredPane();
		layeredPane2.setBounds(10, 54, 751, 306);
		contentPane.add(layeredPane2);
		layeredPane2.setLayout(new CardLayout(0, 0));
		
		// ORDER
		
		saleOrderPanel = new JPanel();
		layeredPane2.add(saleOrderPanel, "name_223784158941200");
		saleOrderPanel.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(116, 43, 132, 19);
		saleOrderPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Product Name");
		lblNewLabel_6.setBounds(10, 46, 108, 13);
		saleOrderPanel.add(lblNewLabel_6);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(295, 45, 386, 205);
		saleOrderPanel.add(scrollPane_4);
		
		table = new JTable();
		scrollPane_4.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setBounds(74, 75, 85, 21);
		saleOrderPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Finish Order");
		btnNewButton_2.setBounds(27, 124, 150, 21);
		saleOrderPanel.add(btnNewButton_2);
		
		// PRODUCTS 
		
		AccessoryPanel = new JPanel();
		layeredPane2.add(AccessoryPanel, "name_223784172008200");
		AccessoryPanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Name");
		lblNewLabel_2_1_1.setBounds(10, 38, 110, 13);
		AccessoryPanel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Colour");
		lblNewLabel_2_2_1.setBounds(10, 58, 110, 13);
		AccessoryPanel.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Discount");
		lblNewLabel_2_3_1.setBounds(10, 78, 110, 13);
		AccessoryPanel.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Description");
		lblNewLabel_2_4_1.setBounds(10, 98, 96, 13);
		AccessoryPanel.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Type of product");
		lblNewLabel_2_5_1.setBounds(10, 118, 110, 13);
		AccessoryPanel.add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_2_6_1 = new JLabel("Supplier Email");
		lblNewLabel_2_6_1.setBounds(10, 138, 110, 13);
		AccessoryPanel.add(lblNewLabel_2_6_1);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("Material");
		lblNewLabel_2_7_1.setBounds(10, 158, 110, 13);
		AccessoryPanel.add(lblNewLabel_2_7_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(130, 158, 174, 19);
		AccessoryPanel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(130, 138, 174, 19);
		AccessoryPanel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(130, 118, 174, 19);
		AccessoryPanel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(130, 98, 174, 19);
		AccessoryPanel.add(textField_16);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(140, 78, 135, 21);
		AccessoryPanel.add(rdbtnNewRadioButton_1);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(130, 58, 174, 19);
		AccessoryPanel.add(textField_24);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(130, 38, 174, 19);
		AccessoryPanel.add(textField_29);
		
		JButton btnNewButton_3_1 = new JButton("Add");
		btnNewButton_3_1.setBounds(10, 181, 85, 21);
		AccessoryPanel.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Add accessory");
		lblNewLabel_4.setBounds(130, 10, 101, 13);
		AccessoryPanel.add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(408, 37, 322, 248);
		AccessoryPanel.add(scrollPane);
		
		accessoryTable = new JTable();
		scrollPane.setViewportView(accessoryTable);
		
		
		// SUPPLIER
		
		supplierCompPanel = new JPanel();
		layeredPane2.add(supplierCompPanel, "name_223784185487500");
		supplierCompPanel.setLayout(null);
		
		emailComp = new JTextField();
		emailComp.setBounds(109, 22, 96, 19);
		supplierCompPanel.add(emailComp);
		emailComp.setColumns(10);
		
		// SUPP. TEXT FIELDS
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(109, 46, 96, 19);
		supplierCompPanel.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(109, 70, 96, 19);
		supplierCompPanel.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(109, 93, 96, 19);
		supplierCompPanel.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(109, 116, 96, 19);
		supplierCompPanel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(109, 141, 96, 19);
		supplierCompPanel.add(textField_7);
		
		// SUP. LABELS
		
		lblNewLabel_1 = new JLabel("For company");
		lblNewLabel_1.setBounds(82, 0, 80, 22);
		supplierCompPanel.add(lblNewLabel_1);
	
		JLabel email = new JLabel("Email");
		email.setBounds(10, 22, 89, 13);
		supplierCompPanel.add(email);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 45, 89, 13);
		supplierCompPanel.add(lblName);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(10, 70, 89, 13);
		supplierCompPanel.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 93, 89, 13);
		supplierCompPanel.add(lblAddress);
		
		JLabel lblZipcode = new JLabel("Zip Code");
		lblZipcode.setBounds(10, 116, 89, 13);
		supplierCompPanel.add(lblZipcode);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(10, 141, 89, 13);
		supplierCompPanel.add(lblCity);
		
		btnNewButton = new JButton("Add");
		btnNewButton.setBounds(10, 164, 85, 21);
		supplierCompPanel.add(btnNewButton);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(386, 45, 331, 233);
		supplierCompPanel.add(scrollPane_3);
		
		compSuppTable = new JTable();
		scrollPane_3.setViewportView(compSuppTable);
		
		test4 = new JPanel();
		layeredPane2.add(test4, "name_223784198099800");
		test4.setLayout(null);
		
		lblNewLabel_3 = new JLabel("TEST");
		lblNewLabel_3.setBounds(125, 64, 151, 41);
		test4.add(lblNewLabel_3);
		
		supplierIndPanel = new JPanel();
		layeredPane2.add(supplierIndPanel, "name_421854757087600");
		supplierIndPanel.setLayout(null);
		
		email_2 = new JLabel("Email");
		email_2.setBounds(47, 24, 65, 13);
		supplierIndPanel.add(email_2);
		
		lblFName_1 = new JLabel("F. Name");
		lblFName_1.setBounds(47, 47, 65, 13);
		supplierIndPanel.add(lblFName_1);
		
		lblLName_1 = new JLabel("L. Name");
		lblLName_1.setBounds(47, 72, 65, 13);
		supplierIndPanel.add(lblLName_1);
		
		lblNumberOfDonations_1 = new JLabel("Num. of donations");
		lblNumberOfDonations_1.setBounds(10, 95, 102, 13);
		supplierIndPanel.add(lblNumberOfDonations_1);
		
		btnNewButton_3 = new JButton("Add");
		btnNewButton_3.setBounds(62, 117, 85, 21);
		supplierIndPanel.add(btnNewButton_3);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(122, 95, 96, 19);
		supplierIndPanel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(122, 72, 96, 19);
		supplierIndPanel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(122, 48, 96, 19);
		supplierIndPanel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(122, 24, 96, 19);
		supplierIndPanel.add(textField_28);
		
		lblNewLabel_5 = new JLabel("For individual");
		lblNewLabel_5.setBounds(130, 10, 88, 13);
		supplierIndPanel.add(lblNewLabel_5);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(375, 24, 335, 256);
		supplierIndPanel.add(scrollPane_2);
		
		indSuppTable = new JTable();
		scrollPane_2.setViewportView(indSuppTable);
		
		JPanel ClothingPanel = new JPanel();
		layeredPane2.add(ClothingPanel, "name_424767717543500");
		ClothingPanel.setLayout(null);
		
		lblNewLabel_2_1 = new JLabel("Name");
		lblNewLabel_2_1.setBounds(10, 50, 45, 13);
		ClothingPanel.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 44, 175, 19);
		ClothingPanel.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(172, 64, 175, 19);
		ClothingPanel.add(textField_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(172, 104, 175, 19);
		ClothingPanel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(172, 124, 175, 19);
		ClothingPanel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(172, 144, 175, 19);
		ClothingPanel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(172, 164, 175, 19);
		ClothingPanel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(172, 184, 175, 19);
		ClothingPanel.add(textField_12);
		
		lblNewLabel_2_2 = new JLabel("Colour");
		lblNewLabel_2_2.setBounds(10, 70, 45, 13);
		ClothingPanel.add(lblNewLabel_2_2);
		
		lblNewLabel_2_3 = new JLabel("Discount");
		lblNewLabel_2_3.setBounds(10, 90, 96, 13);
		ClothingPanel.add(lblNewLabel_2_3);
		
		lblNewLabel_2_4 = new JLabel("Description");
		lblNewLabel_2_4.setBounds(10, 110, 96, 13);
		ClothingPanel.add(lblNewLabel_2_4);
		
		lblNewLabel_2_5 = new JLabel("Type of product");
		lblNewLabel_2_5.setBounds(10, 130, 96, 13);
		ClothingPanel.add(lblNewLabel_2_5);
		
		lblNewLabel_2_6 = new JLabel("Supplier Email");
		lblNewLabel_2_6.setBounds(10, 150, 96, 13);
		ClothingPanel.add(lblNewLabel_2_6);
		
		lblNewLabel_2_7 = new JLabel("Size");
		lblNewLabel_2_7.setBounds(10, 170, 45, 13);
		ClothingPanel.add(lblNewLabel_2_7);
		
		lblNewLabel_2_8 = new JLabel("Gender");
		lblNewLabel_2_8.setBounds(10, 190, 45, 13);
		ClothingPanel.add(lblNewLabel_2_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(182, 84, 69, 21);
		ClothingPanel.add(rdbtnNewRadioButton);
		
		JButton btnNewButton_3_2 = new JButton("Add");
		btnNewButton_3_2.setBounds(10, 213, 85, 21);
		ClothingPanel.add(btnNewButton_3_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(412, 25, 307, 253);
		ClothingPanel.add(scrollPane_1);
		
		ClothingTable = new JTable();
		scrollPane_1.setViewportView(ClothingTable);
		
		JLabel lblNewLabel = new JLabel("Add Clothing");
		lblNewLabel.setBounds(103, 10, 85, 13);
		ClothingPanel.add(lblNewLabel);
		
		
		// Buttons
		
		
		JButton saleOrderB = new JButton("Make Order");
		saleOrderB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels2(saleOrderPanel);
			}

		});
		saleOrderB.setBounds(10, 0, 104, 21);
		contentPane.add(saleOrderB);

		
		JButton productAccB = new JButton("Menu for Accessory");
		productAccB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels2(AccessoryPanel);
			}

		});
		productAccB.setBounds(162, 0, 156, 21);
		contentPane.add(productAccB);
		
		JButton supplerCompB = new JButton("Company Supplier Menu");
		supplerCompB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels2(supplierCompPanel);
			}

		});
		
		JButton productClB = new JButton("Menu for Clothing");
		productClB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels2(ClothingPanel);
			}
		});
		productClB.setBounds(162, 23, 156, 21);
		contentPane.add(productClB);
		supplerCompB.setBounds(328, 0, 175, 21);
		contentPane.add(supplerCompB);
		
		JButton test4B = new JButton("test4B");
		test4B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels2(test4);
			}

		});
		
		supplierIndB = new JButton("Individual Supplier Menu");
		supplierIndB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels2(supplierIndPanel);
			}
		});
		supplierIndB.setBounds(328, 23, 175, 21);
		contentPane.add(supplierIndB);
		test4B.setBounds(10, 23, 104, 21);
		contentPane.add(test4B);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(69, 54, 45, 13);
		contentPane.add(lblNewLabel_2);
	}
}
