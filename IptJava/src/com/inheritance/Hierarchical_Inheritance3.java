package com.inheritance;

public class Hierarchical_Inheritance3 extends Hierarchical_Inheritance {

	public void cycleRate() {
		System.out.println("Rate is Rs.15000");
	}

	public void bikeRate() {
		System.out.println("Rate is Rs.180000");
	}

	public void carRate() {
		System.out.println("Rate is Rs.600000");
	}

	public static void main(String[] args) {
		Hierarchical_Inheritance3 h1 = new Hierarchical_Inheritance3();
		Hierarchical_Inheritance2 h = new Hierarchical_Inheritance2();
		h.cycleName();
		h.cycleColour();
		h1.cycleRate();
		h.bikeName();
		h.bikeColour();
		h1.bikeRate();
		h.carName();
		h.carColour();
		h1.carRate();
		System.out.println();
		System.out.println("HIERARCHICAL INHERITANCE:");
		System.out.println("One parent class property accessed by two [or] more "+
		("\n")+" child class.");
	}

	}

