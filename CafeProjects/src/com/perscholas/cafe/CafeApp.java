package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	static String menuOption;
	static String description = null;
	static double price = 0.00;
	static double subtotal = 0.00;
	static double salesTax = 0.00;
	static double total = 0.00;

	static void chooseProduct(String name, int quantity) {
			
//		menuOption = coffee.getName()
//		description = coffee.getDescription()
//		price = coffee.getPrice()
//		subtotal = coffee.calculateSubtotal(quantity, price)
//		salesTax = coffee.calculateSalesTax(quantity, total)
//		total = coffee.calculateProductTotal()
		
	}

	public static void main(String[] args) {
		Product coffee = new Product("coffee", 2.50, "The best coffee in the world");
		Product espresso = new Product("expresso", 1.75, "For those bitter days");
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
			chooseProduct(product, quantity);
			break;
		case "espresso":
			chooseProduct(product, quantity);
			break;
		case "cappuccino":
			chooseProduct(product, quantity);
			break;
		default:
			menuOption = "Not a valid item";
			break;
		}

		if (quantity != 0) {
			for (int i = 0; i < quantity; i++) {
				System.out.println(menuOption + "|" + description + "|" + "$" + price);
			}
			System.out.println("Subtotal: " + "$" + subtotal);
			System.out.println("Sales tax: " + "$" + salesTax);
			System.out.println("Total: " + "$" + total);
		} else {
			System.out.println("Nah bruh stop playin");
		}

	}
}
