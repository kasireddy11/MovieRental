package com.bls.refactoring;

public class ChildrenMovie extends Movie {

	public ChildrenMovie(String title) {
		super(title);
	}
	@Override
	double getCharge(int daysRented) {
		double thisAmount = 75;
		if (daysRented > 3){
			thisAmount += (daysRented - 3) * 75;
		}
		return thisAmount;
	}
}
