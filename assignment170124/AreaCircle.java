package assignment170124;

public class AreaCircle {

	final int r = 6;// Global Variable

	void Circle() {

		double c1 = 3.14 * r * r;
		System.out.println(c1);
	}

	public static void main(String[] args) {

		AreaCircle a1 = new AreaCircle();
		a1.Circle();

	}

}
