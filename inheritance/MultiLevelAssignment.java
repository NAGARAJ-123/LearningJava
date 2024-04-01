package inheritance;
class SuperClass
{
	static void Add()
	{
		System.out.println("Add");
	}
}

class Subclass extends SuperClass
{
	 static void Add()
	{
		System.out.println("Subclass");
	}
}
public class MultiLevelAssignment extends Subclass
{
	public static void main(String[] args) {
		MultiLevelAssignment m1= new MultiLevelAssignment();
		 m1.Add();
		 m1.Add();
	}
	static void Add()
	{
		System.out.println("Child of Super & Sub");
	}
	 static void add()
	{
		System.out.println("Child of Super & Sub1");
	}

}
