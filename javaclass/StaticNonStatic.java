package javaclass;

import java.security.DomainCombiner;
public class StaticNonStatic {
	public static void Addition()

	{
		System.out.println("Addition");
	}

	static void Substraction() {

		System.out.println("Substraction");
	}

	public static void main(String[] args)

	{
		StaticNonStatic s1 = new StaticNonStatic();
		Addition();
		s1.Multiplication();
		s1.Division();
		Substraction();
	}

	void Multiplication() 
	{
		System.out.println("Multiplication");
	}

	public void Division() 
	{
		System.out.println("Division");
	}
}
