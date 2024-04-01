package enacapsulation;

class Login {
	private String Email_ID = "TestPassword@gmail.com";

	public String Get_Email_ID() {
		return Email_ID;
	}

	public void Set_Email_ID(String Email_ID) {
		this.Email_ID = Email_ID;

	}

	private String Password = "Contact@gmail.com";

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	private int age = 18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class GetterSetterProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l1 = new Login();
		l1.Set_Email_ID("Test@gmail.com");
		System.out.println(l1.Get_Email_ID());

		l1.setPassword("Test");
		System.out.println(l1.getPassword());

		l1.setAge(20);
		System.out.println(l1.getAge());

	}

}
