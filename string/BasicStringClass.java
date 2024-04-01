package string;

public class BasicStringClass {

	public static void main(String[] args) {
		String name="Nagaraj";
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('g'));
		System.out.println(name.concat("Itagi"));
		System.out.println(name.endsWith("a"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.substring(1));
		System.out.println(name.substring(3, 6));
		System.out.println(name.subSequence(3, 6));
	}

}
