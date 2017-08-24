package com.bls.refactoring;

class Rental {
	
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	double getRentAmount() {
		return getMovie().getCharge(getDaysRented());
	}

	int getFrequentRenterPoints() {
		return getMovie().getFrequentRenterPoints(getDaysRented());
	}
}
