package scannerTopic;

import java.util.Scanner;

public class ScannerAssignment2 {

	 Scanner s1 = new Scanner(System.in);//Global 

	void Add() {

		int a1 = s1.nextInt();
		int a2 = s1.nextInt();
		int Add = a1 + a2;
		System.out.println(Add);
	}

	void Sub() {

		int s2 = s1.nextInt();
		int s3 = s1.nextInt();
		int Sub = s2 - s3;
		System.out.println(Sub);
	}

	void Multi() {

		int s3 = s1.nextInt();
		int s4 = s1.nextInt();
		int Multi = s3 * s4;
		System.out.println(Multi);
	}

	void Divi() {

		int s5 = s1.nextInt();
		int s6 = s1.nextInt();
		double Divi = s5 / s6;
		System.out.println(Divi);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerAssignment2 a1 = new ScannerAssignment2();
		a1.Add();
		a1.Sub();
		a1.Multi();
		a1.Divi();

	}

}
