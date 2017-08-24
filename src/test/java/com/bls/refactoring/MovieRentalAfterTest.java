package com.bls.refactoring;

import junit.framework.TestCase;

/*
 * This is the unit test class after refactoring
 * 
 * The changes I have done is removed price code as it is removed completely and instead of calling new Movie I'm calling specific Movie classes
 * 
 * 
 */
public class MovieRentalAfterTest extends TestCase {

	String movieTitleIdentityThief = "Identity Thief";
	String movieTitleInTime = "In time";
	String movieTitleWallE = "Wall E";
	Customer customer = new Customer("Kasi");


	
	public void testCustomer() {
		String customerName = "Kasi";
		Customer customerToTest = new Customer(customerName);
		assertEquals(customerName, customerToTest.getName());
	}



	/*
	 * testMovie() movie method is completely removed as it is mainly focussing on priceCode which is removed now
	 */

	public void testRental() {
		Movie movie = new RegularMovie(movieTitleIdentityThief);
		Rental rental = new Rental(movie, 4);
		assertEquals(4, rental.getDaysRented());
		assertEquals(movie, rental.getMovie());
	}









	public void testRegularMovie() {
		Rental rental = new Rental(new RegularMovie(movieTitleIdentityThief), 2);
		customer.addRental(rental);
		assertEquals("Rental record for : Kasi.....\n\tIdentity Thief: 100.0\n"
				+ "Amount owed is: 100.0\nYou have earned 1 frequent renter points", customer.statement());
	}





	public void testChildrenMovie() {
		Rental rental = new Rental(new ChildrenMovie(movieTitleWallE), 2);
		customer.addRental(rental);
		assertEquals("Rental record for : Kasi.....\n\tWall E: 75.0\n"
				+ "Amount owed is: 75.0\nYou have earned 1 frequent renter points", customer.statement());
	}





	public void testNewReleaseMovie() {
		Rental rental = new Rental(new NewReleaseMovie(movieTitleInTime), 1);
		customer.addRental(rental);
		assertEquals("Rental record for : Kasi.....\n\tIn time: 150.0\n"
				+ "Amount owed is: 150.0\nYou have earned 1 frequent renter points", customer.statement());
	}





	/*
	 * Removed testNonExistingMovie() as we can't instansiate non existing movie now.
	 */

	public void testMultipleMovieRentals() {
		Rental rental = new Rental(new RegularMovie(movieTitleIdentityThief), 5);
		customer.addRental(rental);
		rental = new Rental(new ChildrenMovie(movieTitleWallE), 4);
		customer.addRental(rental);
		rental = new Rental(new NewReleaseMovie(movieTitleInTime), 7);
		customer.addRental(rental);
		assertEquals("Rental record for : Kasi.....\n" + "\tIdentity Thief: 325.0\n" + "\tWall E: 150.0\n"
				+ "\tIn time: 1050.0\n" + "Amount owed is: 1525.0\n"
				+ "You have earned 4 frequent renter points", customer.statement());
	}
}