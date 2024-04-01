package enacapsulation;

class Poly_Encap_Senior
{
	private int age=18;
	
	public int get_age()
	{
		return age;
	}
	
	public void set_age(int age)
	{
		this.age=age;
	}
	
}

public class Poly_Encap {

	public static void main(String[] args) {
		Poly_Encap_Senior p1=new Poly_Encap_Senior();
		p1.set_age(72);
		System.out.println(p1.get_age());

	}

}
