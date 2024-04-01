package assignment170124;

import java.util.Scanner;

public class AreaOfRectangleHumaninput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		                int len[]= new int[4];
		                Scanner sc = new Scanner(System.in);
		                System.out.println("Enter length to find area of rectangle");
		                for(int i=0;i<=len.length-1;i++)
		                {
		                        len[i]=sc.nextInt();
		                }
		                int breadth=7; 

		                for(int i=0;i<len.length;i++)
		                {
		                System.out.println("Area of Rectangle using length " +len[i]+ " is " +len[i]*breadth);
		                }
		        }

		}

