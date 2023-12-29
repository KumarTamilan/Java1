package com.keywords;

public  class Final_Keyword extends Static_Keyword {
	
	final static int a = 50;
	final static int b = 200;
	final static int c = a+b;
	
	
	private final void finalKeyword() {
		
		int a = 500;
		System.out.println(a);
		System.out.println("This is Final Keyword");
	}
	public static void main(String[] args) {
		Final_Keyword f = new Final_Keyword();
		f.finalKeyword();
		System.out.println(c);
		System.out.println();
		System.out.println("It can be access in three levels");
		System.out.println("1.CLASS LEVEL: It cannot be inherite");
		System.out.println("2.METHOD LEVEL: It cannot be Override");
		System.out.println("3.VARIABLE LEVEL: Value cannot be changed");
	}

}
