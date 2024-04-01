package inheritance;

public class Country {
	void CountryRoad() {
		System.out.println("Country Road");
	}
}
class State extends Country {
	void StateRoad() {

		System.out.println("State Road");
	}
}
class City extends Country {
	
	static void CityRoad() {

		System.out.println("City Road");
	}

	public static void main(String[] args) {
		City c1 = new City();
		//State s1 = new State();
		c1.CountryRoad();
		//s1.StateRoad();
		CityRoad();
	}
}