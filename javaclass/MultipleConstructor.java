package javaclass;

public class MultipleConstructor {

	MultipleConstructor() {

		System.out.println("Non Parametrized Constructor");
	}

	MultipleConstructor(int a) {

		System.out.println("Parametrized Constructor with int a");
	}

	MultipleConstructor(boolean a) {

		System.out.println("Parametrized Constructor with boolean a");
	}

	MultipleConstructor(String a) {

		System.out.println("Parametrized Constructor with String a");
	}

	public static void main(String[] args)
	{
		System.out.println("My Main Method");
		new MultipleConstructor();
		new MultipleConstructor(9);
		new MultipleConstructor(false);
		new MultipleConstructor("Nagaraj");
		new MultipleConstructor('z');
	}

	MultipleConstructor(char a) {

		System.out.println("Parametrized Constructor with char a");

	}

}
