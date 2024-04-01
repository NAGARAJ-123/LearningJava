package inheritance;
class State_Name
{
	static void karnataka()
	{
		System.out.println("karnataka");
	}
	

}//sub class or super class untill extends is written

public class CIty_Name extends State_Name
{
	static void bangalore()
	{
		System.out.println("bangalore");
	}
	public static void main(String[] args) 
	{
		
		bangalore();
		karnataka();
		
	}
}
