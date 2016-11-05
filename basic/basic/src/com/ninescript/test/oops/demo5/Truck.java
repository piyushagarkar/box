package com.ninescript.test.oops.demo5;

/**
 * 
 * @author Piyush
 *
 */

class Truck extends Vehicle {
	
	private double tonnage;

	Truck(String make, String model, int year, double tonnage) {
		
		super(make, model, year);
		this.tonnage = tonnage;
	}

	double getTonnage() {
		
		return tonnage;
	}

	void print() {
		
		super.print();
		System.out.println("Tonnage: " + tonnage);
	}
}
