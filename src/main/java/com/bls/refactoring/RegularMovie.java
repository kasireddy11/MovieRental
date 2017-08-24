package com.bls.refactoring;

public class RegularMovie extends Movie{

	public RegularMovie(String title) {
		super(title);
	}
	
	@Override
	double getCharge(int daysRented) {
		double thisAmount = 100;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 75;
		return thisAmount;
	}

}
