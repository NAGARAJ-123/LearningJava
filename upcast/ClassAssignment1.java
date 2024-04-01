package upcast;
class Object
{
	void add()
	{
		char add = 'a';
		System.out.println(add);
	}
}
public class ClassAssignment1 extends Object{
	
	void sub()
	{
		char sub = 'b';
		System.out.println(sub);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1= new ClassAssignment1();//upcasting
		o1.add();
		ClassAssignment1 o2=(ClassAssignment1)o1;//Downcasting
		o2.add();
		o2.sub();
	}

}
