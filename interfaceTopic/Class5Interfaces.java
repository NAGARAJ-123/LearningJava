package interfaceTopic;
interface Class1
{
	  void Add1();
	
}
interface Class2
{
	 void Add2();
	
}
interface Class3
{
	void Add3();
	
}
interface Class4
{
	void Add4();
}
interface Class5
{
	void Add5();
}


public class Class5Interfaces implements Class1,Class2,Class3,Class4,Class5  {

	static void Sub()
	{
		System.out.println("Sub");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub();
		Class5Interfaces c1=new Class5Interfaces();
		c1.Add1();
		c1.Add2();
		c1.Add3();
		c1.Add4();
		c1.Add5();
	}

	@Override
	public void Add5() {
		// TODO Auto-generated method stub
		System.out.println("Add5");
	}

	@Override
	public void Add4() {
		// TODO Auto-generated method stub
		System.out.println("Add4");
	}

	@Override
	public void Add3() {
		// TODO Auto-generated method stub
		System.out.println("Add3");
	}

	@Override
	public void Add2() {
		// TODO Auto-generated method stub
		System.out.println("Add2");
	}

	@Override
	public void Add1() {
		// TODO Auto-generated method stub
		System.out.println("Add1");
	}

}
