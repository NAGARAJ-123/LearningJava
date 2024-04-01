package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TakeArrayfromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int rollno[]=new int[3];
         Scanner s1=new Scanner(System.in);
         for(int i=0;i<=3;i++)
         {
        	   rollno[i]= s1.nextInt();
        	 
         }
         System.out.println(Arrays.toString(rollno));
         

	}

}
