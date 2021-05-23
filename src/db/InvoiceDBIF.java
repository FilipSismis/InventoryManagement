package db;

import java.util.ArrayList;

import model.Invoice;

public interface InvoiceDBIF {
	void addInvoice(Invoice invoice, int saleOrderId);
	ArrayList<Invoice> getInvoiceList();
}
