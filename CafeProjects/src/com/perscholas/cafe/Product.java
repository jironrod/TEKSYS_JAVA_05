package com.perscholas.cafe;

public class Product {

//	member variables
	private String name;
	private double price;
	private String description;
	private double quantity;
	final double salesTax = 0.0775;
	

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
	public double calculateProductTotal(double quantity, double price) {
		return calculateSubtotal(quantity, price) + calculateSalesTax(quantity, price);
	}

	public double calculateSalesTax(double quantity, double price) {
		return calculateSubtotal(quantity, price) * salesTax;
	}

	public double calculateSubtotal(double quantity, double price) {
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
