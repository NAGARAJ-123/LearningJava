package upcast;
class Grand
{
	void add()
	{
		System.out.println("add");
	}
}

class parent extends Grand
{
	void sub()
	{
		System.out.println("sub");
	}
}
public class Child extends parent{
	void mult()
	{
		System.out.println("mult");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p1 = new Child();
		p1.add();
		p1.sub();
		
	}

}
