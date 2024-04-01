package arrays;

import java.util.Arrays;

public class CopyArrayfromAnother {

	public static void main(String[] args) {
		int Array1[]=new int[2];
		Array1[0]=23;
		Array1[1]=24;
		int Array2[]=new int[2];
		for(int i=0;i<Array1.length;i++)
		{
			Array2[i]=Array1[i];
		}
		//System.out.println(Array2[0]);
		System.out.println(Arrays.toString(Array2));
	}

}
