package enacapsulation;

class Authentication {
	private int age = 18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String username = "Test@33434";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String password = "Test@33434";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class New_Auth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Authentication a1 = new Authentication();
		a1.setAge(72);
		a1.setUsername("Test@gmail.com");
		a1.setPassword("65675675");
		System.out.println(a1.getAge());
		System.out.println(a1.getUsername());
		System.out.println(a1.getPassword());
	}

}
