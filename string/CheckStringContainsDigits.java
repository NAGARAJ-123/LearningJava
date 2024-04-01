package string;

import java.util.Arrays;

public class CheckStringContainsDigits {

	public static void main(String[] args) {
		String name = "World123";
		int noofdigits = 0;
		int noofAlpha=0;
		int noofchar = 0;
		char a1[] = name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for (int i = 0; i < a1.length; i++) {
			boolean answer = Character.isAlphabetic(a1[i]);
			if (answer == true) {

				noofchar++;

			} else {
				noofdigits++;

			}
			System.out.println(noofdigits);
			System.out.println(noofchar);
		}
		if (noofchar > (0)) {
			System.out.println("String is made of numeric");
		}

	}

}
