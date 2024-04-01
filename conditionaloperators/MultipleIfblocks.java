package conditionaloperators;

public class MultipleIfblocks {

	public static void main(String[] args) {
		int a = 20;
		int b = 50;
		int c = 40;

		if (a < b) {
			if (b > c) {
				System.out.println("First If Block");
			}
			if (b <= c) {
				System.out.println("Second If Block");
			}
			if (b != c) {
				System.out.println("Third If Block");
			}
			if (b == c) {
				System.out.println("Fourth If Block");
			}

		}

		else {
			System.out.println("Else Condition Executed");
		}
	}

}
