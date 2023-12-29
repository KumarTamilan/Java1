package com.updowncasting;
// Assigning child class property into parent class property.It's possible
//Assigning parent class property into child class property.It's not possible.

public class Child_Property  extends Parent_Property{
	
	public void vehicleType() {
		System.out.println("Scania");
	}
	public void vehicleType1() {
		System.out.println("Tata");
	}
	public void vehicleType2() {
		System.out.println("Safari");
	}
	public void vehicleType3() {
		System.out.println("Bulser");
	}
	public void vehicleType4() {
		System.out.println("Tvs");
	}
	public static void main(String[] args) {
		//Parent_Property c = new Child_Property(); 
		//Child_Property p = newParent_Property(); 
		Child_Property c = new Child_Property();
		c.vehicleType();
		c.vehicleType1();
		c.vehicleType2();
		c.vehicleType3();
		c.vehicleType4();
	}

}
