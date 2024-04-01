package exceptionHandling;

public class FinallyArrayExceptionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[] = new int[4];
		age[0] = 20;
		age[1] = 34;
		age[2] = 30;
		age[3] = 38;

		try {
			age[4] = 50;

		}

		catch (ArrayIndexOutOfBoundsException c1) {

			System.out.println("I have handled ArrayIndexOutofBoundsException");
		}

		finally {
			System.out.println("Finally block executed");
		}

	}

}
