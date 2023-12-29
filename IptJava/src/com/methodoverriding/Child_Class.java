package com.methodoverriding;

public class Child_Class extends Parent_Class{
	
	@Override
	public void vehicleType() {
		super.vehicleType();
	}
	@Override
	public void vehicleType1() {
		super.vehicleType1();
	}
	@Override
	public void vehicleType2() {
		super.vehicleType2();
	}
	@Override
	public void vehicleType3() {
		super.vehicleType3();
	}
	@Override
	public void vehicleType4() {
		super.vehicleType4();
	}
	public static void main(String[] args) {
		Child_Class c = new Child_Class();
		c.vehicleType();
		c.vehicleType1();
		c.vehicleType2();
		c.vehicleType3();
		c.vehicleType4();
		System.out.println();
		System.out.println("METHOD OVERRIDING:");
		System.out.println("Class Name are Different,"
				+ ""+("\n")+"But Method Name,and parameter [or] arguments are same.");
		System.out.println();
		System.out.println("It is also Known as Run Time Polymorphism"
				+ " [or]"+("\n")+"Dynamic Binding [or] Functional Overriding");
	}
	

}
