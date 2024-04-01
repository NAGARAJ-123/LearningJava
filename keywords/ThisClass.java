package keywords;

public class ThisClass {
    int age;
    String name;
    double salary;
    void add(int age, String name, double salary) {
    	this.age=age;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisClass t1=new ThisClass();
		t1.add(6, "Nagaraj", 657656.86);
		System.out.println(t1.age);
		
		
	}

}
