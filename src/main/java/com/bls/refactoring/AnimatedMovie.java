package com.bls.refactoring;

public class AnimatedMovie extends Movie {

	public AnimatedMovie(String title) {
		super(title);
	}

	@Override
	double getCharge(int daysRented) {
		double thisAmount = 90;
		if (daysRented > 4){
			thisAmount += (daysRented - 3) * 100;
		}
		return thisAmount;
	}
}
