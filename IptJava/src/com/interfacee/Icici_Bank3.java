package com.interfacee;

public class Icici_Bank3 implements Icici_Bank1,Icici_Bank2{

	@Override
	public void homeLoan() {
		System.out.println("Home loan is 10%");
	}
	@Override
	public void LandLoan() {
		System.out.println("Land loan is 15%");
	}
	@Override
	public void personalLoan() {
		System.out.println("Personal loan is 12%");
	}
	@Override
	public void businessLoan() {
		System.out.println("Business loan is 14%");
	}
	@Override
	public void bikeLoan() {
		System.out.println("Bike loan is 13%");
	}
	@Override
	public void carLoan() {
		System.out.println("Car loan is 16%");
	}
	@Override
	public void busLoan() {
		System.out.println("Bus loan is 14%");
	}
	@Override
	public void educationLoan() {
		System.out.println("Education loan is 6%");
	}
	public static void main(String[] args) {
		Icici_Bank3 ib = new Icici_Bank3();
		ib.homeLoan();
		ib.LandLoan();
		ib.personalLoan();
		ib.businessLoan();
		ib.bikeLoan();
		ib.carLoan();
		ib.busLoan();
		ib.educationLoan();
		System.out.println();
		System.out.println("INTERFACE:");
		System.out.println("1.It supports abstract method only.");
		System.out.println("2.We cannot create on object for interface,Because there is no implements part.");
		System.out.println("3.By using implements keyword we can access interface.");
		System.out.println("4.Public abstract keyword is default here.");
		System.out.println("5.We can achive multiple inheritance.");
	}

}
