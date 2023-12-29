package com.methodoverloading;
      //In a class method name are same,But parameter [or] arguments are different.
      //It is also known as Runtime Polymorphism [or] Dynamic Binding [or] Functional overloading.
public class Method_Overloading {

	private void studentDetails(int a) {
		System.out.println("Student Id is" + " " + a);
	}

	private void studentDetails(String a, int b) {
		System.out.println("Student Name is" + " " + a + ("\n") + "Student  Mark" + " " + b);
	}

	private void studentDetails(int a, String b) {
		System.out.println("Student Scolarship is" + " " + a + ("\n") + "Student Address is" + " " + b);
	}
	public static void main(String[] args) {
		Method_Overloading m = new Method_Overloading();
		m.studentDetails(1002);
		m.studentDetails("Kumaran", 957);
		m.studentDetails(50000,"Salem");
		System.out.println();
		System.out.println("METHOD OVERLOADING:");
		System.out.println("In a class Method name are same,"
				+ ""+("\n")+"But parameter [or] arguments are different.");
		System.out.println();
		System.out.println("It is also Known as Compile Time Polymorphism"
				+ " [or]"+("\n")+"Static Binding [or] Functional Overloading");
	}

}
