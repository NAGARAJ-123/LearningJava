package exceptionHandling;

import java.util.InputMismatchException;

public class ThrowsProgram {

	public static void main(String[] args) throws InputMismatchException, InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		// throw new NullPointerException();
		throw new InputMismatchException("Text");

	}

}
