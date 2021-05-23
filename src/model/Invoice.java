package model;

import java.util.Date;

public class Invoice {
	private String invoiceNo;
	private Date date;
	private float paidAmount;
		
	public Invoice (String invoiceNo, float paidAmount, long dateLong) {
		this.invoiceNo = invoiceNo;
		this.paidAmount = paidAmount;
		date = new Date(dateLong);
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	public long getDateLong() {
		return date.getTime();
	}
	
}
