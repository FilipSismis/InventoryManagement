package ui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.SupplierControl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class SupplierMenu extends JPanel {
	
	private SupplierControl supplierCtrl;
	
	//company fields
	private JTextField tfCompanyEmail;
	private JTextField tfCompanyName;
	private JTextField tfCompanyPhone;
	private JTextField tfCompanyAddress;
	private JTextField tfCompanyZip;
	private JTextField tfCompanyCity;
	private ArrayList<JTextField> companyFields;

	//person fields
	private JTextField tfPersonEmail;
	private JTextField tfPersonFName;
	private JTextField tfPersonLName;
	private JTextField tfPersonNoOfDonations;
	private ArrayList<JTextField> personFields;
	private JTextField tfDeleteEmail;

	public SupplierMenu() {
		supplierCtrl = new SupplierControl();
		companyFields = new ArrayList<>();
		personFields = new ArrayList<>();
		
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1184, 681);
		add(tabbedPane);
		
		//Company section
		JPanel companySupplier = new JPanel();
		tabbedPane.addTab("Add Company", null, companySupplier, null);
		companySupplier.setLayout(null);
		
		JLabel lblCompanyEmail = new JLabel("Email:");
		lblCompanyEmail.setBounds(10, 11, 90, 14);
		companySupplier.add(lblCompanyEmail);
		
		JLabel lblCompanyName = new JLabel("Name: ");
		lblCompanyName.setBounds(10, 37, 90, 14);
		companySupplier.add(lblCompanyName);
		
		JLabel lblCompanyPhone = new JLabel("Phone number:");
		lblCompanyPhone.setBounds(10, 62, 90, 14);
		companySupplier.add(lblCompanyPhone);
		
		JLabel lblCompanyAddress = new JLabel("Address:");
		lblCompanyAddress.setBounds(10, 87, 90, 14);
		companySupplier.add(lblCompanyAddress);
		
		JLabel lblCompanyZip = new JLabel("Zip code:");
		lblCompanyZip.setBounds(10, 112, 90, 14);
		companySupplier.add(lblCompanyZip);
		
		JLabel lblCompanyCity = new JLabel("City:");
		lblCompanyCity.setBounds(10, 137, 90, 14);
		companySupplier.add(lblCompanyCity);
		
		tfCompanyEmail = new JTextField();
		tfCompanyEmail.setBounds(110, 8, 150, 20);
		companySupplier.add(tfCompanyEmail);
		tfCompanyEmail.setColumns(10);
		companyFields.add(tfCompanyEmail);
		
		tfCompanyName = new JTextField();
		tfCompanyName.setBounds(110, 34, 150, 20);
		companySupplier.add(tfCompanyName);
		tfCompanyName.setColumns(10);
		companyFields.add(tfCompanyName);
		
		tfCompanyPhone = new JTextField();
		tfCompanyPhone.setBounds(110, 59, 150, 20);
		companySupplier.add(tfCompanyPhone);
		tfCompanyPhone.setColumns(10);
		companyFields.add(tfCompanyPhone);
		
		tfCompanyAddress = new JTextField();
		tfCompanyAddress.setBounds(110, 84, 150, 20);
		companySupplier.add(tfCompanyAddress);
		tfCompanyAddress.setColumns(10);
		companyFields.add(tfCompanyAddress);
		
		tfCompanyZip = new JTextField();
		tfCompanyZip.setBounds(110, 109, 150, 20);
		companySupplier.add(tfCompanyZip);
		tfCompanyZip.setColumns(10);
		companyFields.add(tfCompanyZip);
		
		tfCompanyCity = new JTextField();
		tfCompanyCity.setBounds(110, 134, 150, 20);
		companySupplier.add(tfCompanyCity);
		tfCompanyCity.setColumns(10);
		companyFields.add(tfCompanyCity);
		
		JButton btnAddCompany = new JButton("Add Supplier");
		btnAddCompany.setBounds(42, 162, 109, 23);
		companySupplier.add(btnAddCompany);
		btnAddCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				supplierCtrl.addCompanySupplier(tfCompanyEmail.getText(), tfCompanyName.getText(), tfCompanyPhone.getText(), tfCompanyAddress.getText(), 
						tfCompanyZip.getText(), tfCompanyCity.getText());
				clearFields(companyFields);
			}
		});
		
		//Person section
		JPanel personSupplier = new JPanel();
		tabbedPane.addTab("Add Person", null, personSupplier, null);
		personSupplier.setLayout(null);
				
		JLabel lblPersonEmail = new JLabel("Email:");
		lblPersonEmail.setBounds(10, 11, 90, 14);
		personSupplier.add(lblPersonEmail);
		
		JLabel lblPersonFName = new JLabel("First name: ");
		lblPersonFName.setBounds(10, 37, 90, 14);
		personSupplier.add(lblPersonFName);
		
		JLabel lblPersonLName = new JLabel("Last name:");
		lblPersonLName.setBounds(10, 62, 90, 14);
		personSupplier.add(lblPersonLName);
		
		JLabel lblPersonNoOfDonations = new JLabel("Number of donations:");
		lblPersonNoOfDonations.setBounds(10, 87, 120, 14);
		personSupplier.add(lblPersonNoOfDonations);
				
		tfPersonEmail = new JTextField();
		tfPersonEmail.setBounds(110, 8, 150, 20);
		personSupplier.add(tfPersonEmail);
		tfPersonEmail.setColumns(10);
		personFields.add(tfPersonEmail);
		
		tfPersonFName = new JTextField();
		tfPersonFName.setBounds(110, 34, 150, 20);
		personSupplier.add(tfPersonFName);
		tfPersonFName.setColumns(10);
		personFields.add(tfPersonFName);
		
		tfPersonLName = new JTextField();
		tfPersonLName.setBounds(110, 59, 150, 20);
		personSupplier.add(tfPersonLName);
		tfPersonLName.setColumns(10);
		personFields.add(tfPersonLName);
		
		tfPersonNoOfDonations = new JTextField();
		tfPersonNoOfDonations.setBounds(160, 84, 100, 20);
		personSupplier.add(tfPersonNoOfDonations);
		tfPersonNoOfDonations.setColumns(10);
		personFields.add(tfPersonNoOfDonations);
		
		JButton btnAddPerson = new JButton("Add Supplier");
		btnAddPerson.setBounds(41, 112, 109, 23);
		personSupplier.add(btnAddPerson);
		btnAddPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				supplierCtrl.addPersonSupplier(tfPersonEmail.getText(), tfPersonFName.getText(), tfPersonLName.getText(),
						Integer.parseInt(tfPersonNoOfDonations.getText()));
				clearFields(personFields);
			}
		});
		
		//show supplier section
		JPanel supplierPanel = new JPanel();
		tabbedPane.addTab("Show suppliers", null, supplierPanel, null);
		supplierPanel.setLayout(null);
		
		//delete supplier
		JPanel deletePanel = new JPanel();
		tabbedPane.addTab("Delete supplier", null, deletePanel, null);
		deletePanel.setLayout(null);
		
		JLabel lblDeleteEmail = new JLabel("Supplier email:");
		lblDeleteEmail.setBounds(10, 11, 86, 14);
		deletePanel.add(lblDeleteEmail);
		
		tfDeleteEmail = new JTextField();
		tfDeleteEmail.setBounds(125, 8, 184, 20);
		deletePanel.add(tfDeleteEmail);
		tfDeleteEmail.setColumns(10);
		
		JButton btnDelete = new JButton("Delete supplier");
		btnDelete.setBounds(69, 36, 138, 23);
		deletePanel.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				supplierCtrl.deleteSupplier(tfDeleteEmail.getText());
				tfDeleteEmail.setText("");
			}
		});
		
	}
	
	private void clearFields(ArrayList<JTextField> fields) {
		for (JTextField field : fields) {
			field.setText("");
		}
	}

}
