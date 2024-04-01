package enacapsulation;

class Auth {
	private String username = "Testing@gmail.com";

	public void set_username(String username) {
		this.username = username;
	}
	public String get_username() {
		return username;
	}

	private String password = "Software@123";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

public class LinkdinLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auth a1 = new Auth();
		a1.set_username("Test@gmail.com");
		System.out.println(a1.get_username());
		a1.setPassword("12345667");
		System.out.println(a1.getPassword());

	}

}
