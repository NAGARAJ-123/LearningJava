package abstractClass;

abstract class Country_Class {

	abstract void nh_road();// abstarct methods

	static void add() // concrete methods
	{
		System.out.println("Some logics are being exposed");
	}
}

abstract class state_Class extends Country_Class {

	void subtract() {
		System.out.println("Some small logics are being exposed");
	}
}

public class City_Class extends state_Class {
	void multi() {
		System.out.println("Multiplication");
	}

	static void divi() {
		System.out.println("Division");
	}

	public static void main(String[] args) {

		City_Class c1 = new City_Class();
		c1.state_road();
		divi();
		c1.multi();
	}

	void state_road() {

		System.out.println("State Road");
	}

	void nh_road() {

		System.out.println("National Highway Road");
	}
}
