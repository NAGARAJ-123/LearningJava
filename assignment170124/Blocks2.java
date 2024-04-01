package assignment170124;

public class Blocks2 {
	Blocks2(int a) {
		System.out.println("I am Constructor");
	}

	static {
		System.out.println("I am SIB");
	}
	{
		System.out.println("I am IIB");
	}

	public static void main(String[] args) {

		System.out.println("i am Main method");
		new Blocks2(9);

	}

}
