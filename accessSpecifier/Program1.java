package accessSpecifier;

public class Program1 {
private void m1(){
	System.out.println("M1");
}

public void m2(){
	System.out.println("M2");
}

protected void m3(){
	System.out.println("M3");
}
void m4(){
	System.out.println("M4");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 p1=new Program1();
		p1.m1();
		p1.m2();
		p1.m3();
		p1.m4();
	}

}
