package control;

import db.SaleOrderDB;
import db.SaleOrderDBIF;
import model.SaleOrder;

public class SaleOrderControl {
	private ProductControl productControl;
	private InvoiceControl invoiceControl;
	private SaleOrderDBIF saleOrderDB;
	private SaleOrder saleOrder;
	
	
	public SaleOrderControl() {
		productControl = new ProductControl();
		invoiceControl = new InvoiceControl();
		saleOrderDB = new SaleOrderDB();
	}
	
	public void createSaleOrder(String orderNo) {
		saleOrder = new SaleOrder(orderNo);
		saleOrderDB.addSaleOrder(saleOrder);
	}
	
	public void addProduct(String pName) {
		if(!productControl.getProductByPName(pName).isSold()) {
			productControl.updateProduct(pName, "sold", "true");
			saleOrder.addProduct(productControl.getProductByPName(pName));
		}
	}
	
	public void finishOrder(String invoiceNo) {
		invoiceControl.createInvoice(invoiceNo, saleOrder.getTotalPrice(), saleOrder.getTimeLong(), saleOrder.getSaleOrderId());		
	}
}
