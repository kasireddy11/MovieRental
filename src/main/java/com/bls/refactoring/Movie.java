package com.bls.refactoring;

public abstract class Movie {	
	private String title;

	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	abstract double getCharge(int daysRented);

	/*
	 * Code Smell: 1 duplicated blocks of code must be removed.
	 * This is repeated in ChildrenMovie and RegularMovie if abstracted, it violates DRY principle
	 * So, returning 1 directly and will override for other values
	 * 
	 * But there is a code smell here because i'm not using daysRented variable here
	 */
	int getFrequentRenterPoints(int daysRented){
		return 1;
	}
}
