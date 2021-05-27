package control;

import java.sql.SQLException;

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
		try {
			productControl.updateProductToSold(pName, saleOrder.getSaleOrderId());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		saleOrder.addProduct(productControl.getProductByPName(pName));
	}
	
	public void finishOrder(String invoiceNo) {
		invoiceControl.createInvoice(invoiceNo, saleOrder.getTotalPrice(), saleOrder.getTimeLong(), saleOrder.getSaleOrderId());		
	}
}
