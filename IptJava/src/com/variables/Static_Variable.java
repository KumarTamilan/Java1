package com.variables;                        
public class Static_Variable {         
	static byte b = 100;    
	static short s = 200;
	static int a = 300;
	static long l = 400;		
	
	
	public static void main(String[] args) {
		System.out.println(b);
		System.out.println(s);
		System.out.println(a);
		System.out.println(l);
		System.out.println(b+s+a+l);
		System.out.println();
		System.out.println("STATIC VARIABLE:");
		System.out.println("1..Static variable mut be inside the class outside the method.");
		System.out.println("2.If we do not initialize the value the given datatype is automatically printed in default value.");
		System.out.println("3.If we give static in class level but do not give local level.");
	}


}
