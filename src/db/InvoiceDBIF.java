package db;

import model.Invoice;

public interface InvoiceDBIF {
	void addInvoice(Invoice invoice, int saleOrderId);
}
