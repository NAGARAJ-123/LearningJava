package upcast;
class Program2
{
	void add()
	{
		System.out.println("Add");
	}
	void subtract()
	{
		System.out.println("Subtract");
	}
}
public class Program1 extends Program2
{
	void multiple()
	{
		System.out.println("multiple");
	}
	public static void main(String[] args) 
	{
		Program2 p1	=new Program1();//upcasting implicit
		p1.add();
		p1.subtract();
//		Program2 p2	=(Program2)new Program1();//upcasting explicit

		Program1 p3=(Program1)p1;//Down casting
		p3.add();
		p3.subtract();
		p3.multiple();
		
		
	}

}
