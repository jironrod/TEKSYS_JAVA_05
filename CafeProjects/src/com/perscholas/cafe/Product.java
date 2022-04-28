package com.perscholas.cafe;

public class Product {

//	member variables
	private String name;
	private double price;
	private String description;
	private int quantity;

//	default constructor
	public Product() {

	}

//	overloaded constructor
	public Product(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

//	methods
	public double calculateProductTotal() {
		return calculateSubtotal(quantity, price) + calculateSalesTax(quantity, price);
	}

	public double calculateSalesTax(int quantity, double price) {
		return (quantity * price) * 0.0775;
	}

	public double calculateSubtotal(int quality, double price) {
		return quantity * price;
	}

//	GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
