package model;

import java.util.ArrayList;
import java.util.Date;

public class SaleOrder {
	private String orderNo;
	private Date saleDateTime;
	private int saleOrderId;
	private ArrayList<Product> productList;
	
	public SaleOrder(String orderNo) {
		this.orderNo = orderNo;
		productList = new ArrayList<>();
		saleDateTime = new Date();
	}
	
	public SaleOrder(String orderNo, long date) {
		this.orderNo = orderNo;
		productList = new ArrayList<>();
		saleDateTime = new Date(date);
	}
	
	
	public void addProduct(Product product) {
		productList.add(product);
	}

	public int getSaleOrderId() {
		return saleOrderId;
	}

	public void setSaleOrderId(int saleOrderId) {
		this.saleOrderId = saleOrderId;
	}

	public float getTotalPrice() {
		float totalPrice = 0;
		for(Product product : productList) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public long getTimeLong() {
		return saleDateTime.getTime();
	}
	
}
