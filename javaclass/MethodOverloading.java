package javaclass;
public class MethodOverloading {
//Developing multiple methods with the same name but variations in the arguements list is called "method overloading"----
	void add(int a, int b, int c) {
		System.out.println("Add non-static int");
	}

	void add(double a, int b, int c) {
		System.out.println("Add non-static double & int");
	}

	void add(int a, double b, int c) {
		System.out.println("Add non-static int & double");
	}
	public static void main(String[] args) {

		System.out.println("Calling static & Non- static method into main method");
		MethodOverloading m1 = new MethodOverloading();
		m1.add(19, 123, 10000);
		m1.add(19.10, 120, 11000);
		m1.add(190, 120.00, 12000);
		add("MethodOverloading", '1');
		add('a', "MethodOverloading");
	}

	static void add(String a, char b) {
		System.out.println("Add static String & char");
	}

	static void add(char a, String b) {
		System.out.println("Add static char & string");
	}

}
