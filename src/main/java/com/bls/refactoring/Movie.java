package com.bls.refactoring;
/*
 * I have added this class as abstract class 
 * So that if any new Category is added it will override the existing methods for its own implementation
 * If any change request comes for a new category, we can just extend this class and override according to the change request
 * Now as we have separate classes for each these will be Open for extension and closed for modification
 */
public abstract class Movie {	
	private String title;
	
	/*
	 * Pricecode is completely removed as it is not required
	 */
	/*
	 * static constants has been removed as they were used previously for the switch case,
	 *  now each type of movie has its own class. 
	 *  If there are more list of movie types to be added there will be more constants to be added, which is also not good
	 * the static constants are no longer necessary
	 */

	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	abstract double getCharge(int daysRented);

	/*
	 * Code Smell: 1 duplicated blocks of code must be removed.(Sonar Code smell)
	 * This is repeated in ChildrenMovie and RegularMovie if abstracted, it violates DRY principle
	 * So, returning 1 directly and will override for other values
	 * 
	 * But there is a code smell here because i'm not using daysRented variable here
	 */
	int getFrequentRenterPoints(int daysRented){
		return 1;
	}
}
