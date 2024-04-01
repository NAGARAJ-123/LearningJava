package string;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input="Sandy";
        
        for(int i=input.length()-1;i>=0;i--)
        {
        	char output= input.charAt(i);
        	 System.out.print(output);
        }
        
	}

}
