package control;

import java.util.ArrayList;

import db.InvoiceDB;
import db.InvoiceDBIF;
import model.Invoice;

public class InvoiceControl {
	private InvoiceDBIF invoiceDB;
	
	
	public InvoiceControl() {
		invoiceDB = new InvoiceDB();
	}
	
	public void createInvoice(String invoiceNo, float totalPrice, long timeLong, int saleOrderId) {
		Invoice invoice = new Invoice(invoiceNo, totalPrice, timeLong);
		invoiceDB.addInvoice(invoice, saleOrderId);
	}
	
	public ArrayList<Invoice> getInvoiceList(){
		return invoiceDB.getInvoiceList();
	}

}
