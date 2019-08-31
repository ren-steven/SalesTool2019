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
		System.out.println("This is Master!!!\n");
		
		System.out.println("HELLO HAPPY SALES People! -- modified under maseter");
		System.out.println("THIS APP SHOWS SALES DATA!");
		System.out.println("Wow! It pushed!");
	}
}
