package scannerTopic;

import java.util.Scanner;

public class ScannerAssignment1 {

	void Add() {
		Scanner s1 = new Scanner(System.in);
		int a1 = s1.nextInt();
		int a2 = s1.nextInt();
		int Add = a1 + a2;
System.out.println(Add);
	}

	void Sub() {
		Scanner s1 = new Scanner(System.in);
		int s2 = s1.nextInt();
		int s3 = s1.nextInt();
		int Sub = s2 - s3;
		System.out.println(Sub);
	}

	void Multi() {
		Scanner s1 = new Scanner(System.in);
		int s3 = s1.nextInt();
		int s4 = s1.nextInt();
		int Multi = s3 * s4;
		System.out.println(Multi);
	}

	void Divi() {
		Scanner s1 = new Scanner(System.in);
		int s5 = s1.nextInt();
		int s6 = s1.nextInt();
		double Divi = s5 / s6;
		System.out.println(Divi);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerAssignment1 a1=new ScannerAssignment1();
		a1.Add();
		a1.Sub();
		a1.Multi();
		a1.Divi();
		
	}

}
