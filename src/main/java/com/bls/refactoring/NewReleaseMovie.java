package com.bls.refactoring;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title);
	}





	@Override
	double getCharge(int daysRented) {
		return (double)daysRented * 150;
	}





	@Override
	int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		else
			return 1;
	}

}
