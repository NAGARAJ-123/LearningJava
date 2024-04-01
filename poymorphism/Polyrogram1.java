package poymorphism;

class Polyrogram {
	void add() {
		System.out.println("add");
	}
}

public class Polyrogram1 extends Polyrogram {

	void add() {
		System.out.println("sub");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polyrogram1 p1 = new Polyrogram1();
		p1.add();
		Polyrogram p2 = new Polyrogram();
		p2.add();
	}

}
