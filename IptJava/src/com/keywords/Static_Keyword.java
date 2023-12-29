package com.keywords;

public class Static_Keyword {
	
	static int a = 200;
	static int b = 300;
	static int c = a+b;
	
	private static void staticKeyword() {

		int a = 300;
		int b = 200;
		int c = a+b;
		System.out.println(c);
		System.out.println("This is static Keyword");
	}
	public static void main(String[] args) {
		Static_Keyword s = new Static_Keyword();
		s.staticKeyword();
		System.out.println(c);
		System.out.println();
		System.out.println("1.It can be used in Method level and Variable level.");
		System.out.println("2.Once we declare the static in method level without using object.");
		System.out.println("3.We can call the static method and static variable.Does not give static in class level..");
		
	}

}
