package upcast;
class MainHouseBangalore
{
	void MainHome()
	{
		System.out.println("MainHome");
	}
}
class MiddleHouseBangalore extends MainHouseBangalore
{
	void MiddleHome()
	{
		System.out.println("MiddleHome");
	}
}

public class OwnHouseAssignment2 extends MiddleHouseBangalore {
	
	void OwnHome()
	{
		System.out.println("OwnHome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainHouseBangalore m1=new OwnHouseAssignment2();
		m1.MainHome();
		OwnHouseAssignment2 o1=(OwnHouseAssignment2)m1;
		o1.MainHome();
		o1.MiddleHome();
		o1.OwnHome();
		
	}

}
