package com.inheritance;

public class Multilevel_Inheritance3 extends Multilevel_Inheritance2{
	
	public void cycleRate() {
System.out.println("Rate is Rs.15000");
	}
	public void bikeRate() {
System.out.println("Rate is Rs.180000");
	}
	public void carRate() {
System.out.println("Rate is Rs.600000");
	}
	public static void main (String[ ]  args)  {
		Multilevel_Inheritance3  m = new Multilevel_Inheritance3();
		m.cycleName();
		m.cycleColour();
		m.cycleRate();
		m.bikeName();
		m.bikeColour();
		m.bikeRate();
		m.carName();
		m.carColour();
		m.carRate();
		System.out.println();
		System.out.println("MULTILEVEL INHERITANCE:");
		System.out.println("One class property accessed by one child class"+
		("\n")+"Which is being accessed by another child class.");
	}

}
