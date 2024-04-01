package logicalOperator;

public class ANDOperator {
	static int a = 100;
	static int b = 200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (a < b && b > a)// T & T
		{
			System.out.println(true);
		} else {
			System.out.println("false");
		}
		if (a > b && b == a)// F & F
		{
			System.out.println(true);
		} else {
			System.out.println("false");
		}
		if (a <= b && a >= b) // T & F
		{
			System.out.println(true);
		} else {
			System.out.println("false");
		}
		if (a == b && a != b)// F & T
		{
			System.out.println(true);
		} else {
			System.out.println("false");
		}
	}

}
