package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import db.ConnectionDB;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.Canvas;
import java.awt.Label;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLayeredPane layeredPane2;
	private JPanel saleOrderPanel;
	private JPanel AccessoryPanel;
	private JPanel supplierCompPanel;
	private JLabel lblNewLabel_1;
	protected JTextField emailCompT;
	protected JTextField nameT;
	protected JTextField phoneT;
	protected JTextField addressT;
	protected JTextField zipcodeT;
	protected JTextField cityT;
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
	private JTextField nameCl;
	private JTextField colourCl;
	private JTextField descriptionCl;
	private JTextField productTypeCl;
	private JTextField supplEmailCl;
	private JTextField sizeCl;
	private JTextField genderCl;
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
	private JTable orderTable;
	protected JLabel connLabel;

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
		
		orderTable = new JTable();
		scrollPane_4.setViewportView(orderTable);
		
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
		
		// SUPP. TEXT FIELDS
		
		emailCompT = new JTextField();
		emailCompT.setBounds(109, 22, 96, 19);
		supplierCompPanel.add(emailCompT);
		emailCompT.setColumns(10);
		
		nameT = new JTextField();
		nameT.setColumns(10);
		nameT.setBounds(109, 46, 96, 19);
		supplierCompPanel.add(nameT);
		
		phoneT = new JTextField();
		phoneT.setColumns(10);
		phoneT.setBounds(109, 70, 96, 19);
		supplierCompPanel.add(phoneT);
		
		addressT = new JTextField();
		addressT.setColumns(10);
		addressT.setBounds(109, 93, 96, 19);
		supplierCompPanel.add(addressT);
		
		zipcodeT = new JTextField();
		zipcodeT.setColumns(10);
		zipcodeT.setBounds(109, 116, 96, 19);
		supplierCompPanel.add(zipcodeT);
		
		cityT = new JTextField();
		cityT.setColumns(10);
		cityT.setBounds(109, 141, 96, 19);
		supplierCompPanel.add(cityT);
		
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
		
		nameCl = new JTextField();
		nameCl.setColumns(10);
		nameCl.setBounds(172, 44, 175, 19);
		ClothingPanel.add(nameCl);
		
		colourCl = new JTextField();
		colourCl.setColumns(10);
		colourCl.setBounds(172, 64, 175, 19);
		ClothingPanel.add(colourCl);
		
		descriptionCl = new JTextField();
		descriptionCl.setColumns(10);
		descriptionCl.setBounds(172, 104, 175, 19);
		ClothingPanel.add(descriptionCl);
		
		productTypeCl = new JTextField();
		productTypeCl.setColumns(10);
		productTypeCl.setBounds(172, 124, 175, 19);
		ClothingPanel.add(productTypeCl);
		
		supplEmailCl = new JTextField();
		supplEmailCl.setColumns(10);
		supplEmailCl.setBounds(172, 144, 175, 19);
		ClothingPanel.add(supplEmailCl);
		
		sizeCl = new JTextField();
		sizeCl.setColumns(10);
		sizeCl.setBounds(172, 164, 175, 19);
		ClothingPanel.add(sizeCl);
		
		genderCl = new JTextField();
		genderCl.setColumns(10);
		genderCl.setBounds(172, 184, 175, 19);
		ClothingPanel.add(genderCl);
		
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
		
		supplierIndB = new JButton("Individual Supplier Menu");
		supplierIndB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels2(supplierIndPanel);
			}
		});
		supplierIndB.setBounds(328, 23, 175, 21);
		contentPane.add(supplierIndB);
		
		
		
		
		
	}
