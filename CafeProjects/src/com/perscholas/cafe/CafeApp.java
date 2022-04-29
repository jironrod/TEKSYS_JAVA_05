package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	static String menuOption;
	static String description = null;
	static double price = 0.00;
	static double subtotal = 0.00;
	static double salesTax = 0.00;
	static double total = 0.00;

	static void chooseProduct(Product name, int quantity) {

		menuOption = name.getName();
		description = name.getDescription();
		price = name.getPrice();
		subtotal = name.calculateSubtotal(quantity, price);
		salesTax = name.calculateSalesTax(quantity, price);
		total = name.calculateProductTotal(quantity, price);
	}

	public static void main(String[] args) {
		Product coffee = new Product("coffee", 2.50, "The best coffee in the world");
		Product espresso = new Product("espresso", 1.75, "For those bitter days");
		Product cappuccino = new Product("cappuccino", 3.25, "Cloud 9");

		Scanner scan = new Scanner(System.in);

		String product;
		int quantity;

		try {
			System.out.println("Welcome to CafeJava. What would you like?");
			product = scan.nextLine().toLowerCase();
			System.out.println("How many of that product would you like?");
			quantity = scan.nextInt();

		} finally {
			if (scan != null) {
				scan.close();
			}
		}

		switch (product) {
		case "coffee":
			chooseProduct(coffee, quantity);
			break;
		case "espresso":
			chooseProduct(espresso, quantity);
			break;
		case "cappuccino":
			chooseProduct(cappuccino, quantity);
			break;
		default:
			menuOption = "Not a valid item";
			break;
		}

		if (quantity != 0) {
			for (int i = 0; i < quantity; i++) {
				System.out.println(menuOption + "|" + description + "|" + "$" + price);
			}
			System.out.println("Subtotal: " + "$" + (String.format("%.2f", subtotal)));
			System.out.println("Sales tax: " + "$" + (String.format("%.2f", salesTax)));
			System.out.println("Total: " + "$" + (String.format("%.2f", total)));
		} else {
			System.out.println("Nah bruh stop playin");
		}
	}
}
