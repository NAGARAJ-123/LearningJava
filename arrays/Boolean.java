package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Boolean {

	
	public static void main(String[] args) {
		boolean age []=new boolean[2];
		Scanner s1=new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			age[i] = s1.nextBoolean();
	}
			System.out.println(Arrays.toString(age));	
		
	}
}
