package com.bls.refactoring;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {

	private String name;
	private ArrayList<Rental> rentals = new ArrayList<Rental>();





	public Customer(String name) {
		this.name = name;
	}





	public void addRental(Rental arg) {
		rentals.add(arg);
	}





	public String getName() {
		return name;
	}





	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;

		/*
		 * Code Smell: As suggested by quality analyzer I'm changing to StringBuilder which is better than String for performance
		 */
		StringBuilder statementValue = new StringBuilder();
		statementValue.append("Rental record for : " + this.getName() + ".....\n");
		/*
		 * Iterator is a raw type. References to generic type Iterator<E> should be parameterized - eclipse warning
		 * So adding reference type Rental here and for decleration also
		 */
		Iterator<Rental> iter = rentals.iterator();
		while (iter.hasNext()) {
			Rental each = iter.next();
			frequentRenterPoints += each.getFrequentRenterPoints();
			statementValue.append("\t" + each.getMovie().getTitle() + ": " + each.getRentAmount() + "\n");
			totalAmount += each.getRentAmount();
		}
		statementValue.append("Amount owed is: " + totalAmount + "\n");
		statementValue.append("You have earned " + frequentRenterPoints + " frequent renter points");
		return statementValue.toString();
	}
}
