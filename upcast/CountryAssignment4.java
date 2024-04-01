package upcast;
class city
{
	void Bangalore() {
		System.out.println("Bangalore");
	}
}

class State extends city
{
	void Karnataka() {
		System.out.println("Karnataka");
	}
}

class State1 extends State
{
	void Maharastra() {
		System.out.println("Maharastra");
	}
}
public class CountryAssignment4 extends State1 {
	
	void India() {
		System.out.println("India");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		city c1=new State();//upcasting
		c1.Bangalore();
		
		State1 s1=(State1)c1;//Downcasting
		s1.Bangalore();
		s1.Karnataka();
		s1.Maharastra();
		
		
      
	}

}
