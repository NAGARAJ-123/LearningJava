package conditionaloperators;

public class InsideElseCondtion {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		if(a>b)
		{
			System.out.println("Execute If Condition");
		}
		else {
			
			if(a==b)
			{
				System.out.println("Execute If Condition inside Else");
			}
			else
			{
				System.out.println("Execute Else Condition inside Else");
			}
		}

	}

}
