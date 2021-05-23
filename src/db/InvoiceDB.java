package db;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Invoice;

public class InvoiceDB implements InvoiceDBIF{
	
	public InvoiceDB() {
		
	}

	public void addInvoice(Invoice invoice, int saleOrderId) {
		String query = "insert Invoice (invoiceNo, saleOrderId, paymentDate, paidAmount) values(?, ?, ?, ?)";
		try(PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(query)){
			pstmt.setString(1, invoice.getInvoiceNo());
			pstmt.setInt(2, saleOrderId);
			pstmt.setDate(3, new Date(invoice.getDateLong()));
			pstmt.setFloat(4, invoice.getPaidAmount());
			
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
