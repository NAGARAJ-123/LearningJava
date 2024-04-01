package upcast;
class BigSofa
{
	void Sofa1()
	{
		System.out.println("Single");
	}
}
class MediumSofa extends BigSofa
{
	void Sofa2()
	{
		System.out.println("Double");
	}
}
public class SmallSofaAssignment3 extends MediumSofa {

	void Sofa3()
	{
		System.out.println("Threeble");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediumSofa m1=new SmallSofaAssignment3();
		m1.Sofa1();
		m1.Sofa2();
		SmallSofaAssignment3 b1=(SmallSofaAssignment3)m1;
		b1.Sofa2();
		b1.Sofa1();
		b1.Sofa3();
		
	
		
	}

}
