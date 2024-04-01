package assignment170124;

public class Print1to500 {
	
	static void divide()
	{
	for(int i=1;i<501;i++)
	{
		System.out.println(i);	
		
		if ( i%3 == 0) {
			System.out.println(i + " - Computer ");	
		}
		else if ( i%5 == 0 ) {
			System.out.println(i + " - Mouse ");	
		}
		else if ( i%3 == 0 && i%5 == 0 ) {
			System.out.println(i + " - Computer and Mouse ");	
		}
	}
	}
	public static void main(String[] args) {
		
		divide();
		

}
}
		

		


