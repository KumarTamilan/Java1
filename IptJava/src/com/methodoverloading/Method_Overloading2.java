package com.methodoverloading;
public class Method_Overloading2 {

	private void employeeDetails(String a,String b,String c, String d,String e ) {
		System.out.println("Employee Name is"+" "+a+","+b+","+c+","+d+","+e);		
	}
	private void employeeDetails(int a,int b,int c,int d,int e) {
        System.out.println("Employee Id is"+" "+a+","+b+","+c+","+d+","+e);
	}
	private void employeeDetails(float a,float b,float c,float d,float e) {
        System.out.println("Employee Percendage is"+" "+a+","+b+","+c+","+d+","+e);
	}
	private void employeeDetails(double a,double b,double c,double d,double e) {
        System.out.println("Employee Salary is"+" "+a+","+b+","+c+","+d+","+e);
	}
	private void employeeDetails(long a,long b,long c,long d,long e) {
		System.out.println("Employee MobileNummber is"+" "+a+","+b+","+c+","+d+","+e);
	} 
	private void employeeDetails(char a,char b,char c,char d,char e) {
		System.out.println("Employee Grade is"+" "+a+","+b+","+c+","+d+","+e);
	}
	public static void main(String[] args) {
		Method_Overloading2 mo = new Method_Overloading2();
		mo.employeeDetails("Kumaran","Deva","Mohan","Karthik","Sasi");
		mo.employeeDetails(1001, 1002, 1003, 1004, 1005);
		mo.employeeDetails(0.92f, 0.97f, 0.95f, 0.95f, 0.96f);
		mo.employeeDetails(60000, 80000, 70000, 70000, 80000);
		mo.employeeDetails(9687857685l, 9687757685l, 9574657687l, 9385768867l,9783756473l);
		mo.employeeDetails('S', 'S', 'S', 'S', 'S');
		System.out.println();
		System.out.println("METHOD OVERLOADING:");
		System.out.println("In a class Method name are same,"
				+ ""+("\n")+"But parameter [or] arguments are different.");
		System.out.println();
		System.out.println("It is also Known as Compile Time Polymorphism"
				+ " [or]"+("\n")+"Static Binding [or] Functional Overloading");
		
	}

}