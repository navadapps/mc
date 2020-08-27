package io.navadappsMC.paymentservice.models;

public class Payment {
	
	private int order_id;
	private double amount;
	
	
	public Payment(int order_id, double amount) {
		super();
		this.order_id = order_id;
		this.amount = amount;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
