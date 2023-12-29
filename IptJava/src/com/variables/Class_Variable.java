package com.variables;                     
                                                  
public class Class_Variable {      
	byte b = 100;    
	short s = 200;
	int a = 300;
	long l = 400;
	
	public static void main(String[] args) {
		Class_Variable cv = new Class_Variable();
		System.out.println(cv.b);
		System.out.println(cv.s);
		System.out.println(cv.a);
		System.out.println(cv.l);
		System.out.println(cv.b+cv.s+cv.a+cv.l);
		System.out.println();
		System.out.println("CLASS VARIABLE:");
		System.out.println("1.Class variable must be inside the class outside the method");
		System.out.println("2.If we give local variable and class variable same reference name the priority go to local variable.");
		System.out.println("3.If we do not initialize the value the given data type default value is printed.");
	}

}
