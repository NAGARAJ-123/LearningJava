package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class Program2Add {

	public static void main(String[] args) {
		
		ArrayList a2=new ArrayList();
		a2.add(34);
		a2.add(45);
		a2.add(36);
		a2.add(67);
		a2.add(68);
		a2.add(29);
		a2.add(40);
		a2.add(65);
		a2.add(54);
		//Collections.sort(a2);
		Collections.reverseOrder();
		System.out.println(a2);
		
		

	}

}
