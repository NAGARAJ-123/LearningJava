package string;

public class ReverseString {

	public static void main(String[] args) {
		String input="Nagaraj";
		String output="";
		
		for (int i=input.length()-1;i>=0;i--)
			
		{
			char char1=input.charAt(i);
			output=output+char1;
			
		}
		System.out.println(output);
		
		

		
	}

}
