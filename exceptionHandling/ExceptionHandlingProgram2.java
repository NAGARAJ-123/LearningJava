package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingProgram2 {

	public static void main(String[] args) {
		try {
			Scanner s1 = new Scanner(System.in);
			int c1 = 1 / s1.nextInt();
			System.out.println("TryBlock");
		}

		catch (ArithmeticException a1) {
			System.out.println("I have handled one exception ArithmeticException");
		}

		catch (NullPointerException a2) {
			System.out.println("I have handled one exception NullPointerException");
		}

		catch (InputMismatchException a3) {
			System.out.println("I have handled one exception InputMismatchException");
		} catch (ArrayIndexOutOfBoundsException a4) {
			System.out.println("I have handled one exception ArrayIndexOutOfBoundsException");
		}

		finally {
			System.out.println("Finally Block Executed");
		}

	}
}
