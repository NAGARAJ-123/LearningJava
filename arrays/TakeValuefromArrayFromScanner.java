package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TakeValuefromArrayFromScanner {

	public static void main(String[] args) {
		int Age[]= new int[3];
		Scanner s1=new Scanner(System.in);
		
		for (int i=0;i<3;i++)
		{
			Age[i]=s1.nextInt();
		
		}
			System.out.println(Arrays.toString(Age));
		

	}

}
