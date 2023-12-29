package com.inheritance;

public class Single_Inheritance2 extends Single_Inheritance{
	
	public void cycleColour() {
System.out.println("Red Colour");
	}
	public void bikeColour() {
System.out.println("Yellow Colur");
	}
	public void carColour() {
System.out.println("Black Colour");
	}
	
	public static void main (String[ ] args) {
		Single_Inheritance2 s = new Single_Inheritance2();
		s.cycleName();
		s.cycleColour();
		s.bikeName();
		s.bikeColour();
		s.carName();
		s.carColour();
		System.out.println();
		System.out.println("SINGLE INHERITANCE:");
		System.out.println("One parent class property accessed by one child class.");
	}

}
