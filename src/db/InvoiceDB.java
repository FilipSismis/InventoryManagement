package db;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	public ArrayList<Invoice> getInvoiceList() {
		ArrayList<Invoice> invoiceList = new ArrayList<>();
		String query = "select * from Invoice";
		try(PreparedStatement pstmt = ConnectionDB.getInstance().getConnection().prepareStatement(query)){
			ResultSet rs = pstmt.executeQuery();
			invoiceList = buildInvoiceList(rs);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return invoiceList;
	}
	
	private ArrayList<Invoice> buildInvoiceList(ResultSet rs)throws SQLException {
		ArrayList<Invoice> invoiceList = new ArrayList<>();
		while(rs.next()) {
			invoiceList.add(buildInvoice(rs));
		}
		return invoiceList;
	}
	
	private Invoice buildInvoice(ResultSet rs)throws SQLException {
		Invoice invoice = null;
		if(rs.next()) {
			invoice = new Invoice(rs.getString("invoiceNo"), rs.getFloat("paidAmount"), rs.getDate("paymentDate").getTime());
		}
		return invoice;
	}
	
}
