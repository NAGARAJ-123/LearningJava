package assignment170124;

public class Print1to365 {
	
	static void Add()
	{
		for(int i=1;i<366;i++)
		{
			System.out.print(i +"-");
			
			if(i>=1 && i<=31) {
				System.out.println("January");
			}		
			if(i>=32 && i<=59) {
				System.out.println("February");
			}
			if(i>=60 && i<=90) {
				
				System.out.println("March");
			}
			if(i>=91 && i<=120) {
				
				System.out.println("April");
			}
			if(i>=121 && i<=151) {
				
				System.out.println("May");
			}
			if(i>=152 && i<=181) {
				
				System.out.println("June");
			}
			if(i>=182 && i<=212) {
				
				System.out.println("July");
			}
			if(i>=213 && i<=243) {
				
				System.out.println("August");
			}
			if(i>=244 && i<=273) {
				
				System.out.println("September");
			}
			if(i>=274 && i<=304) {
				
				System.out.println("October");
			}
			if(i>=305 && i<=334) {
				
				System.out.println("November");
			}
			if(i>=335 && i<=365) {
				
				System.out.println("December");
			}
		}
	}

	public static void main(String[] args) {
	
             Add();
	}

}
