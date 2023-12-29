package com.keywords;

public class This_Super2 extends This_Super {
	
	static int a= 240;
	static int b = 400;
	static int c = a+b;
	
	public void sample2() {

		int a =200;
		int b = 300;
		int c = a+b;
		System.out.println(c);
		System.out.println(this.c);       
		System.out.println(super.c);    
	
	}
	public static void main(String[] args) {
		This_Super2 t = new This_Super2();
		t.sample2();
		t.sample();
		System.out.println();
		System.out.println("1.THIS: Current Class Reference.");
		System.out.println("2.SUPER:Perant Class Reference");
	}

}
