package assignment170124;

public class Blocks {
	Blocks()
	{
		System.out.println("I am Constructor");
	}
	static
	{
		System.out.println("I am SIB");
	}
	{
		System.out.println("I am IIB");
	}
	public static void main(String[] args) {
	
      System.out.println("i am Main method");
		new Blocks();
		new Blocks();
	}

}
