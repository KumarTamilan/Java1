package com.variables;                          
					                                     
public class Local_Variable {            

	public void localVariable() {

		byte b = 100; // All Variables are Local Variable
		short s = 200;
		int a = 300;
		long l = 400;
		float f = 0.500f;
		double d = 600;
		char c = 'X';
		boolean r = true;

		System.out.println("byte value is" + " " + b + ("\n") + "short value is" + " " + s + ("\n") + "int value is"
				+ " " + a + ("\n") + "long value is" + " " + l + ("\n") + "float value is" + " " + f + ("\n")
				+ "double value is" + " " + d + ("\n") + "char value is" + " " + c + ("\n") + "boolean value is" + " "
				+ r);
	}
	public static void main(String[] args) {
		Local_Variable lv = new Local_Variable();
		lv.localVariable();
		System.out.println();
		System.out.println("LOCAL VARIABLE:");
		System.out.println("1.Local Variable must be inside the method");
		System.out.println("2.We must initialize the value");
		System.out.println("3.Lifecycle through out the method");
	}

}
