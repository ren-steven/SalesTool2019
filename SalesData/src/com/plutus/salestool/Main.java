/**
 * 
 */
package com.plutus.salestool;

/**
 * @author sren
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES People!");
		System.out.println("THIS APP SHOWS SALES DATA!");
		System.out.println("Wow! It pushed!");
	}
}
