package javaclass;
public class MethodConstrOverload {

	MethodConstrOverload() {
		System.out.println("Constructor overload without arguements");
	}
	MethodConstrOverload(int a) {
		System.out.println("Constructor overload with int a");
	}
	MethodConstrOverload(char a) {

		System.out.println("Constructor overload with char a");
	}
	public static void main(String[] args) {
		MethodConstrOverload m1 = new MethodConstrOverload();
		new MethodConstrOverload(9);
		new MethodConstrOverload('a');
		m1.Add(10, 30);
		m1.Add(10.954, 29, 'a');
		Add();
		Add(9, 10.00);
	}
	static void Add() {
		System.out.println("Method overload without arguements");
	}
	void Add(int a, int b) {

		System.out.println("Method overload with int a & int b");
	}
	static void Add(int b, double a) {

		System.out.println("Method overload with int b & double a");
	}
	void Add(double a, int b, char c) {

		System.out.println("Method overload with double a, int b & char c");
	}
}
