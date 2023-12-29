package com.abstraction;

public class Abstract_Class2 extends Abstract_Class {

	@Override
	public void van() {
		System.out.println("Van colour is sky blue");
	}
	@Override
	public void tembo() {
		System.out.println("Tembo colour is black");
	}
	@Override
	public void lorry() {
		System.out.println("Lorry colour is white");
	}
	@Override
	public void ship() {
		System.out.println("Ship colour is blue");
	}
	@Override
	public void aeroplane() {
		System.out.println("Aeroplane colour is Black and white");
	}
	public static void main(String[] args) {
		Abstract_Class2 ac = new Abstract_Class2();
		ac.cycle();
		ac.bike();
		ac.van();
		ac.tembo();
		ac.lorry();
		ac.bus();
		ac.ship();
		ac.aeroplane();
		System.out.println();
		System.out.println("ABSTRACT CLASS:");
		System.out.println("1.It support both Abstract method and Non-abstract method.");
		System.out.println("2.We cannot create on object for abstract class,Because there"
		+("\n")+"  is no implementation part,signature part,and printing statements.");
		System.out.println("3.By using extends keywords we can access abstract class.");
		System.out.println("4.Public abstract keyword is mandatory.");
		
	}
	

}
