package com.bls.refactoring;

import junit.framework.TestCase;

/*
 * This is the unit test class before refactoring
 * 
 * I have attached sonar reports that has 100% coverage in code, line, condition and no bugs, vulnerabilities and code smells in this class
 * 
 * @method testMultipleMovieRentals() and individual test cases are written to cover condition coverage if one is >n other will be <n
 * 
 * @method testNonExistingMovie() is written to a scenario for non existing movie
 * 
 */
public class MovieRentalBeforeTest extends TestCase {
	public void testCustomer() {
		String customerName = "Kasi";
		Customer customerToTest = new Customer(customerName);
		assertEquals(customerName, customerToTest.getName());
	}
	/*	
		String movieTitleIdentityThief="Identity Thief";
		String movieTitleInTime = "In time";
		String movieTitleWallE = "Wall E";
		Customer customer = new Customer("Kasi");
		
		public void testMovie(){
			Movie movie = new Movie(movieTitleIdentityThief, 500);
			assertEquals(movieTitleIdentityThief,movie.getTitle());
			assertEquals(500,movie.getPriceCode());
			//changing pricecode
			movie.setPriceCode(800);
			assertEquals(800,movie.getPriceCode());
		}
		
		public void testRental(){
			Movie movie = new Movie(movieTitleIdentityThief, 500);
			Rental rental = new Rental(movie, 4);
			assertEquals(4,rental.getDaysRented());
			assertEquals(movie, rental.getMovie());
		}
		
		
		
		
		public void testRegularMovie(){
			Rental rental = new Rental(new Movie(movieTitleIdentityThief, Movie.REGULAR), 2);
			customer.addRental(rental);
			assertEquals("Rental record for : Kasi.....\n\tIdentity Thief: 100.0\n" 
					+ "Amount owed is: 100.0\nYou have earned 1 frequent renter points", customer.statement());
		}
		
		
		public void testChildrenMovie(){
			Rental rental = new Rental(new Movie(movieTitleWallE, Movie.CHILDREN), 2);
			customer.addRental(rental);
			assertEquals("Rental record for : Kasi.....\n\tWall E: 75.0\n" 
					+ "Amount owed is: 75.0\nYou have earned 1 frequent renter points", customer.statement());
		}
		
		
		public void testNewReleaseMovie(){
			Rental rental = new Rental(new Movie(movieTitleInTime, Movie.NEW_RELEASE), 1);
			customer.addRental(rental);
			assertEquals("Rental record for : Kasi.....\n\tIn time: 150.0\n"
					+ "Amount owed is: 150.0\nYou have earned 1 frequent renter points", customer.statement());
		}
		
		public void testNonExistingMovie(){
			Rental rental = new Rental(new Movie(movieTitleInTime, 123456789), 1);
			customer.addRental(rental);
			assertEquals("Rental record for : Kasi.....\n\tIn time: 0.0\n"
					+ "Amount owed is: 0.0\nYou have earned 1 frequent renter points", customer.statement());
		}
		
		public void testMultipleMovieRentals() {
			Rental rental = new Rental(new Movie(movieTitleIdentityThief, Movie.REGULAR), 5);
			customer.addRental(rental);
			rental = new Rental(new Movie(movieTitleWallE, Movie.CHILDREN), 4);
			customer.addRental(rental);
			rental = new Rental(new Movie(movieTitleInTime, Movie.NEW_RELEASE), 7);
			customer.addRental(rental);
			assertEquals("Rental record for : Kasi.....\n" 
					+ "\tIdentity Thief: 325.0\n" 
					+ "\tWall E: 150.0\n" 
					+ "\tIn time: 1050.0\n"
					+ "Amount owed is: 1525.0\n"
					+ "You have earned 4 frequent renter points", customer.statement());
		}*/
}