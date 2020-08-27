package io.navadappsMC.menuservice.models;

public class MenuItem {
	private int menu_id;
	private String name;
	private String description;
	private double price;
	
	
	public MenuItem(int menu_id, String name, String description, double d) {
		super();
		this.menu_id = menu_id;
		this.name = name;
		this.description = description;
		this.price = d;
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
