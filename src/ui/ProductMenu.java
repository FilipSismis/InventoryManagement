package ui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ProductControl;

import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class ProductMenu extends JPanel {
	//accessory fields
	private ProductControl productCtrl;
	private JTextField tfAccessoryName;	
	private JTextField tfAccessoryColour;
	private JTextField tfAccessoryDescription;
	private JTextField tfAccessoryEmail;
	private JTextField tfAccessoryMaterial;
	private ArrayList<JTextField> accessoryFields;
	
	//clothing fields
	private JTextField tfClothingName;
	private JTextField tfClothingColour;
	private JTextField tfClothingDescription;
	private JTextField tfClothingEmail;
	private JTextField tfClothingSize;
	private JTextField tfClothingGender;
	private ArrayList<JTextField> clothingFields;
	private JTextField tfDeleteName;
	private JTextField tfUpdateName;
	private JTextField tfUpdateValue;
	
	public ProductMenu() {
		productCtrl = new ProductControl();
		accessoryFields = new ArrayList<>();
		clothingFields = new ArrayList<>();
		
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1184, 681);
		add(tabbedPane);
		
		//accessory section
		JPanel accessoryPanel = new JPanel();
		tabbedPane.addTab("Add Accessory", null, accessoryPanel, null);
		accessoryPanel.setLayout(null);
		
		JLabel lblAccessoryName = new JLabel("Name:");
		lblAccessoryName.setBounds(10, 11, 90, 14);
		accessoryPanel.add(lblAccessoryName);
		
		JLabel lblAccessoryColour = new JLabel("Colour:");
		lblAccessoryColour.setBounds(10, 37, 90, 14);
		accessoryPanel.add(lblAccessoryColour);
		
		JLabel lblAccessoryDiscount = new JLabel("Discount:");
		lblAccessoryDiscount.setBounds(10, 62, 90, 14);
		accessoryPanel.add(lblAccessoryDiscount);
		
		JLabel lblAccessoryDescription = new JLabel("Description:");
		lblAccessoryDescription.setBounds(10, 87, 90, 14);
		accessoryPanel.add(lblAccessoryDescription);
		
		JLabel lblAccessoryProductType = new JLabel("Product Type:");
		lblAccessoryProductType.setBounds(10, 112, 90, 14);
		accessoryPanel.add(lblAccessoryProductType);
		
		JLabel lblAccessorySupplierEmail = new JLabel("Supplier Email:");
		lblAccessorySupplierEmail.setBounds(10, 137, 90, 14);
		accessoryPanel.add(lblAccessorySupplierEmail);
		
		JLabel lblAccessoryMaterial = new JLabel("Material:");
		lblAccessoryMaterial.setBounds(10, 162, 90, 14);
		accessoryPanel.add(lblAccessoryMaterial);
		
		tfAccessoryName = new JTextField();
		tfAccessoryName.setBounds(110, 8, 150, 20);
		accessoryPanel.add(tfAccessoryName);
		tfAccessoryName.setColumns(10);
		accessoryFields.add(tfAccessoryName);
		
		tfAccessoryColour = new JTextField();
		tfAccessoryColour.setBounds(110, 34, 150, 20);
		accessoryPanel.add(tfAccessoryColour);
		tfAccessoryColour.setColumns(10);
		accessoryFields.add(tfAccessoryColour);
		
		JCheckBox cbAccessoryDiscount = new JCheckBox("");
		cbAccessoryDiscount.setBounds(110, 58, 97, 23);
		accessoryPanel.add(cbAccessoryDiscount);
		
		tfAccessoryDescription = new JTextField();
		tfAccessoryDescription.setBounds(110, 84, 150, 20);
		accessoryPanel.add(tfAccessoryDescription);
		tfAccessoryDescription.setColumns(10);
		accessoryFields.add(tfAccessoryDescription);
		
		String[] accessoryProductTypes  = {"glasses", "scarf", "tie", "handbag"};
		JComboBox accessoryProductTypeList = new JComboBox(accessoryProductTypes);
		accessoryProductTypeList.setBounds(110, 108, 150, 22);
		accessoryPanel.add(accessoryProductTypeList);
		
		tfAccessoryEmail = new JTextField();
		tfAccessoryEmail.setBounds(110, 134, 150, 20);
		accessoryPanel.add(tfAccessoryEmail);
		tfAccessoryEmail.setColumns(10);
		accessoryFields.add(tfAccessoryEmail);
		
		tfAccessoryMaterial = new JTextField();
		tfAccessoryMaterial.setBounds(110, 159, 150, 20);
		accessoryPanel.add(tfAccessoryMaterial);
		tfAccessoryMaterial.setColumns(10);
		accessoryFields.add(tfAccessoryMaterial);
		
		JButton btnAddAccessory = new JButton("Add Accessory");
		btnAddAccessory.setBounds(76, 187, 127, 23);
		accessoryPanel.add(btnAddAccessory);
		btnAddAccessory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productCtrl.addAccessory(tfAccessoryName.getText(), tfAccessoryColour.getText(), cbAccessoryDiscount.isSelected(), 
						tfAccessoryDescription.getText(), (String)accessoryProductTypeList.getSelectedItem(), tfAccessoryEmail.getText(), 
						tfAccessoryMaterial.getText());
				clearFields(accessoryFields);
			}
		});
		
		//clothing section
		JPanel clothingPanel = new JPanel();
		tabbedPane.addTab("Add Clothing", null, clothingPanel, null);
		clothingPanel.setLayout(null);
		
		JLabel lblClothingName = new JLabel("Name:");
		lblClothingName.setBounds(10, 11, 90, 14);
		clothingPanel.add(lblClothingName);
		
		JLabel lblClothingColour = new JLabel("Colour:");
		lblClothingColour.setBounds(10, 37, 90, 14);
		clothingPanel.add(lblClothingColour);
		
		JLabel lblClothingDiscount = new JLabel("Discount:");
		lblClothingDiscount.setBounds(10, 62, 90, 14);
		clothingPanel.add(lblClothingDiscount);
		
		JLabel lblClothingDescription = new JLabel("Description:");
		lblClothingDescription.setBounds(10, 87, 90, 14);
		clothingPanel.add(lblClothingDescription);
		
		JLabel lblClothingProductType = new JLabel("Product Type:");
		lblClothingProductType.setBounds(10, 112, 90, 14);
		clothingPanel.add(lblClothingProductType);
		
		JLabel lblClothingSupplierEmail = new JLabel("Supplier Email:");
		lblClothingSupplierEmail.setBounds(10, 137, 90, 14);
		clothingPanel.add(lblClothingSupplierEmail);
		
		JLabel lblClothingSize = new JLabel("Size:");
		lblClothingSize.setBounds(10, 162, 90, 14);
		clothingPanel.add(lblClothingSize);
		
		JLabel lblClothingGender = new JLabel("Gender:");
		lblClothingGender.setBounds(10, 187, 90, 14);
		clothingPanel.add(lblClothingGender);
		
		tfClothingName = new JTextField();
		tfClothingName.setBounds(110, 8, 150, 20);
		clothingPanel.add(tfClothingName);
		tfClothingName.setColumns(10);
		clothingFields.add(tfClothingName);
		
		tfClothingColour = new JTextField();
		tfClothingColour.setBounds(110, 34, 150, 20);
		clothingPanel.add(tfClothingColour);
		tfClothingColour.setColumns(10);
		clothingFields.add(tfClothingColour);
		
		JCheckBox cbClothingDiscount = new JCheckBox("");
		cbClothingDiscount.setBounds(110, 58, 97, 23);
		clothingPanel.add(cbClothingDiscount);
		
		tfClothingDescription = new JTextField();
		tfClothingDescription.setBounds(110, 84, 150, 20);
		clothingPanel.add(tfClothingDescription);
		tfClothingDescription.setColumns(10);
		clothingFields.add(tfClothingDescription);
		
		String[] clothingProductTypes  = {"boots", "pants", "shirt", "sweatshirt", "jacket", "suit", "dress"};
		JComboBox clothingProductTypeList = new JComboBox(clothingProductTypes);
		clothingProductTypeList.setBounds(110, 108, 150, 22);
		clothingPanel.add(clothingProductTypeList);
		
		tfClothingEmail = new JTextField();
		tfClothingEmail.setBounds(110, 134, 150, 20);
		clothingPanel.add(tfClothingEmail);
		tfClothingEmail.setColumns(10);
		clothingFields.add(tfClothingEmail);
		
		tfClothingSize = new JTextField();
		tfClothingSize.setBounds(110, 159, 150, 20);
		clothingPanel.add(tfClothingSize);
		tfClothingSize.setColumns(10);
		clothingFields.add(tfClothingSize);
		
		tfClothingGender = new JTextField();
		tfClothingGender.setBounds(110, 184, 150, 20);
		clothingPanel.add(tfClothingGender);
		tfClothingGender.setColumns(10);
		clothingFields.add(tfClothingGender);
		
		JButton btnAddClothing = new JButton("Add Clothing");
		btnAddClothing.setBounds(80, 222, 127, 23);
		clothingPanel.add(btnAddClothing);
		btnAddClothing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productCtrl.addClothing(tfClothingName.getText(), tfClothingColour.getText(), cbClothingDiscount.isSelected(), 
						tfClothingDescription.getText(), (String)clothingProductTypeList.getSelectedItem(), tfClothingEmail.getText(), 
						tfClothingSize.getText(), tfClothingGender.getText());
				clearFields(clothingFields);
			}
		});
		
		//table section
		JPanel productPanel = new JPanel();
		tabbedPane.addTab("Show products", null, productPanel, null);
		
		//delete product
		JPanel deletePanel = new JPanel();
		tabbedPane.addTab("Delete product", null, deletePanel, null);
		deletePanel.setLayout(null);
		
		JLabel lblDeleteName = new JLabel("Name:");
		lblDeleteName.setBounds(10, 11, 46, 14);
		deletePanel.add(lblDeleteName);
		
		tfDeleteName = new JTextField();
		tfDeleteName.setBounds(69, 11, 106, 20);
		deletePanel.add(tfDeleteName);
		tfDeleteName.setColumns(10);
		
		JButton btnDelete = new JButton("Delete Product");
		btnDelete.setBounds(31, 43, 121, 23);
		deletePanel.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productCtrl.deleteProduct(tfDeleteName.getText());
				tfDeleteName.setText("");
			}
		});
		
		//update product section
		JPanel updatePanel = new JPanel();
		tabbedPane.addTab("Update product", null, updatePanel, null);
		updatePanel.setLayout(null);
		
		JLabel lblUpdateName = new JLabel("Name:");
		lblUpdateName.setBounds(10, 11, 90, 14);
		updatePanel.add(lblUpdateName);
		
		JLabel lblFilter = new JLabel("Filter:");
		lblFilter.setBounds(10, 37, 90, 14);
		updatePanel.add(lblFilter);
		
		JLabel lblFilterParam = new JLabel("Update value");
		lblFilterParam.setBounds(10, 62, 90, 14);
		updatePanel.add(lblFilterParam);
				
		tfUpdateName = new JTextField();
		tfUpdateName.setBounds(110, 34, 150, 20);
		updatePanel.add(tfUpdateName);
		tfUpdateName.setColumns(10);
		
		String[] filterListString = {"discount", "supplierId", "productTypeId", "sold", "saleOrderid"};
		JComboBox filterList = new JComboBox(filterListString);
		filterList.setBounds(110, 8, 150, 20);
		updatePanel.add(filterList);
		
		tfUpdateValue = new JTextField();
		tfUpdateValue.setBounds(110, 58, 150, 20);
		updatePanel.add(tfUpdateValue);
		tfUpdateValue.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(86, 87, 115, 23);
		updatePanel.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productCtrl.updateProduct(tfUpdateName.getText(), (String)filterList.getSelectedItem(), tfUpdateValue.getText());
				tfUpdateName.setText("");
				tfUpdateValue.setText("");
			}
		});
		
	}
	
	private void clearFields(ArrayList<JTextField> fields) {
		for (JTextField field : fields) {
			field.setText("");
		}
	}
}
