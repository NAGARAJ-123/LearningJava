package string;

public class Checktwostringpalindrome {

	public static void main(String[] args) {
		String input="Madam";
		String output="";
		
		for (int i=input.length()-1;i>=0;i--)
			
		{
			char char1=input.charAt(i);
			output=output+char1;
			
		}
		System.out.println(output);
		
		System.out.println("Hey it is " + input.equalsIgnoreCase(output));

		
	}

}
