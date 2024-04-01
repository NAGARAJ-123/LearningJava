package string;

public class SwapTwoVariablewithoutThird {

	public static void main(String[] args) {
		int no1, no2;
        no1 = 10;
        no2 = 20;

        //print values before swapping
        System.out.println("Before swapping - no1->: "+ no1 +", no2: " + no2);

        //swap numbers
        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;

        // print values after swapping
        System.out.println("After swapping - no1->: "+ no1 +", no2: " + no2);

	}

}
