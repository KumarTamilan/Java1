package com.variables;

public class All_Variables {

	static byte b = 120;                //1.Using Class level,Local level,Static level
	static short s = 500;                //2.First priority goes to method level
	static int a = 600;                   //3.We must initialize the value in method level
	static long l = 700;                 

	private void allVariable() {

		byte b = 100;
		short s = 200;
		int a = 300;                        //Local variable must be inside the method 
		long l = 400;                      //Class variable must be inside the class and outside the method
		System.out.println(b);       //Static variable must be outside the method and inside the class
		System.out.println(s);
		System.out.println(a);
		System.out.println(l);
		
	}
	public static void main(String[] args) {
		All_Variables av = new All_Variables();
		av.allVariable();
		System.out.println(b);
		System.out.println(s);
		System.out.println(a);
		System.out.println(l);
		System.out.println();
		System.out.println("LOCAL Variable,CLASS Variable,STATIC Variable");
	}
}
