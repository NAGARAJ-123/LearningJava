package exceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int c = 1 / 1;
			System.out.println(c);
		}

		catch (ArithmeticException a1) {
			System.out.println("I have handled one exception");
		}

	}

}
