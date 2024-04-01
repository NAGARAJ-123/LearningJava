package string;

import java.util.Arrays;

public class NoofAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int noofAlpha=0;
		
		String name = "world is full of beautiful people";
		char a1[] = name.toCharArray();
	
		System.out.println(Arrays.toString(a1));
		for (int i = 0; i < a1.length; i++) {
			boolean answer = Character.isAlphabetic(a1[i]);
			if (answer == true) {

				noofAlpha++;

			}
			System.out.println(noofAlpha);
		
		}
		if (noofAlpha > (0)) {
			System.out.println("String is made of Small Letters");
		}

	}

}
