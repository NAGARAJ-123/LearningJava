package exceptionHandling;

public class ArrayConcatAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int RollNo[] = new int[5];
		String StudentName[] = new String[5];
		char Gender[] = new char[5];
		int MobileNumber[] = new int[5];
		RollNo[0] = 1;
		RollNo[1] = 2;
		RollNo[2] = 3;
		RollNo[3] = 4;
		RollNo[4] = 5;
		StudentName[0] = "Kushal";
		StudentName[1] = "Kushal P";
		StudentName[2] = "Vishal Prasad";
		StudentName[3] = "Monica Rawat";
		StudentName[4] = "Kushagra Verma";
		Gender[0] = 'M';
		Gender[1] = 'M';
		Gender[2] = 'M';
		Gender[3] = 'F';
		Gender[4] = 'M';
		MobileNumber[0] = 968574;
		MobileNumber[1] = 857412;
		MobileNumber[2] = 857421;
		MobileNumber[3] = 968521;
		MobileNumber[4] = 967452;

		System.out.println("StudentName\t" + StudentName[0] + "\t" + StudentName[1] + "\t" + StudentName[2] + "\t"
				+ StudentName[3] + "\t" + StudentName[4]);
		System.out.println("Gender\t\t" + Gender[0] + "\t" + Gender[1] + "\t\t\t" + Gender[2] + "\t\t" + Gender[3]
				+ "\t\t" + Gender[4]);
		System.out.println("MobileNumber\t" + MobileNumber[0] + "\t" + MobileNumber[1] + "\t\t" + MobileNumber[2]
				+ "\t\t" + MobileNumber[3] + "\t\t" + MobileNumber[4]);
		System.out.println("RollNo\t\t" + RollNo[0] + "\t" + RollNo[1] + "\t\t\t" + RollNo[2] + "\t\t" + RollNo[3]
				+ "\t\t" + RollNo[4]);

		System.out.print('\n');

		System.out.println("RollNo\t\t" + "StudentName\t\t" + "Gender\t\t" + "MobileNumber\t\t");
		System.out.println(RollNo[0] + "\t\t" + StudentName[0] + "\t\t\t" + Gender[0] + "\t\t" + MobileNumber[0]);
		System.out.println(RollNo[1] + "\t\t" + StudentName[1] + "\t\t" + Gender[1] + "\t\t" + MobileNumber[1]);
		System.out.println(RollNo[2] + "\t\t" + StudentName[2] + "\t\t" + Gender[2] + "\t\t" + MobileNumber[2]);
		System.out.println(RollNo[3] + "\t\t" + StudentName[3] + "\t\t" + Gender[3] + "\t\t" + MobileNumber[3]);
		System.out.println(RollNo[4] + "\t\t" + StudentName[4] + "\t\t" + Gender[4] + "\t\t" + MobileNumber[4]);
	}

}
