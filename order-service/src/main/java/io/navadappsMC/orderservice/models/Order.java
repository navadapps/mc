package io.navadappsMC.orderservice.models;

public class Order {
	private int order_id;
	private String items;
	
	
	public Order(int order_id, String items) {
		super();
		this.order_id = order_id;
		this.items = items;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	
	
	

}
