package assignment170124;

public class DivisionProgram {

	static void divide() {
		for (int i = 1; i < 100; i++) {

			if (i % 3 == 0) {
				System.out.println(i + " - Frog ");
			} else if (i % 5 == 0) {
				System.out.println(i + " - Cat ");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " - Frog and Cat ");
			}
		}
	}

	public static void main(String[] args) {

		divide();

	}

}
