package ui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.InvoiceControl;
import control.SaleOrderControl;
import model.Invoice;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTable;

public class SaleOrderMenu extends JPanel {
	private SaleOrderControl saleOrderCtrl;
	private InvoiceControl invoiceCtrl;
	private JTextField tfSaleOrderNo;
	private JTextField tfPName;
	private JTextField tfInvoiceNo;
	private JTable table;
	

	public SaleOrderMenu() {
		saleOrderCtrl = new SaleOrderControl();
		invoiceCtrl = new InvoiceControl();
		
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1184, 681);
		add(tabbedPane);
		
		//sale order section
		JPanel saleOrderPanel = new JPanel();
		tabbedPane.addTab("Make sale order", null, saleOrderPanel, null);
		saleOrderPanel.setLayout(null);
		
		JPanel createPanel = new JPanel();
		createPanel.setBounds(0, 0, 500, 290);
		saleOrderPanel.add(createPanel);
		createPanel.setLayout(null);
		
		JPanel panelAddProduct = new JPanel();
		panelAddProduct.setBounds(0, 0, 500, 290);
		saleOrderPanel.add(panelAddProduct);
		panelAddProduct.setLayout(null);
		panelAddProduct.setVisible(false);
		
		JPanel panelFinishOrder = new JPanel();
		panelFinishOrder.setBounds(0, 0, 500, 290);
		saleOrderPanel.add(panelFinishOrder);
		panelFinishOrder.setLayout(null);
		panelFinishOrder.setVisible(false);
		
		JLabel lblSaleOrderNo = new JLabel("Sale order number:");
		lblSaleOrderNo.setBounds(10, 11, 110, 14);
		createPanel.add(lblSaleOrderNo);
		
		tfSaleOrderNo = new JTextField();
		tfSaleOrderNo.setBounds(130, 8, 110, 20);
		createPanel.add(tfSaleOrderNo);
		tfSaleOrderNo.setColumns(10);
		
		JButton btnCreateSaleOrder = new JButton("Create Sale order");
		btnCreateSaleOrder.setBounds(71, 39, 145, 23);
		createPanel.add(btnCreateSaleOrder);
		btnCreateSaleOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saleOrderCtrl.createSaleOrder(tfSaleOrderNo.getText());
				tfSaleOrderNo.setText("");
				createPanel.setVisible(false);
				panelAddProduct.setVisible(true);
			}
		});
		
		JLabel lblPName = new JLabel("Product name:");
		lblPName.setBounds(10, 11, 82, 14);
		panelAddProduct.add(lblPName);
		
		tfPName = new JTextField();
		tfPName.setBounds(102, 8, 110, 20);
		panelAddProduct.add(tfPName);
		tfPName.setColumns(10);
		
		JButton btnAddProduct = new JButton("Add Product");
		btnAddProduct.setBounds(20, 39, 125, 23);
		panelAddProduct.add(btnAddProduct);
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saleOrderCtrl.addProduct(tfPName.getText());
				tfPName.setText("");
			}
		});
		
		JButton btnFinishOrder = new JButton("Finish Order");
		btnFinishOrder.setBounds(155, 39, 125, 23);
		panelAddProduct.add(btnFinishOrder);
		btnFinishOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAddProduct.setVisible(false);
				panelFinishOrder.setVisible(true);
				tfPName.setText("");
			}
		});
		
		JLabel lblInoviceNo = new JLabel("Invoice number:");
		lblInoviceNo.setBounds(10, 11, 82, 14);
		panelFinishOrder.add(lblInoviceNo);
		
		tfInvoiceNo = new JTextField();
		tfInvoiceNo.setBounds(102, 8, 110, 20);
		panelFinishOrder.add(tfInvoiceNo);
		tfInvoiceNo.setColumns(10);
		
		JButton btnFinishOrder2 = new JButton("Finish Order");
		btnFinishOrder2.setBounds(71, 39, 125, 23);
		panelFinishOrder.add(btnFinishOrder2);
		btnFinishOrder2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saleOrderCtrl.finishOrder(tfInvoiceNo.getText());
				panelFinishOrder.setVisible(false);
				createPanel.setVisible(true);
				tfInvoiceNo.setText("");
			}
		});
				
		//invoice section
		JPanel invoicePanel = new JPanel();
		tabbedPane.addTab("Show invoices", null, invoicePanel, null);
		invoicePanel.setLayout(null);
		
		JButton btnShowInvoices = new JButton("Show Invoices");
		btnShowInvoices.setBounds(10, 11, 132, 23);
		invoicePanel.add(btnShowInvoices);
		btnShowInvoices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				String[] columnNames = {"Invoice number", "Paid amount", "Date paid"};
				ArrayList<Invoice> invoices = invoiceCtrl.getInvoiceList();
				int noOfInvoices = invoices.size();
				Object[][] data = new Object[noOfInvoices][3];
				for (int i = 0; i < noOfInvoices; i++) {
					  for (int j = 0; j < 3; j++) {
					    switch(i) {
					    case 0:
					    	invoices.get(j).getInvoiceNo();
					    	break;
					    case 1:
					    	invoices.get(j).getPaidAmount();
					    	break;
					    case 2:
					    	invoices.get(j).getDate();
					    	break;
					    }
					  }
					}
				table = new JTable(data, columnNames);
				table.setBounds(10, 45, 1159, 597);
				invoicePanel.add(table);
			}
		});
	}
}
