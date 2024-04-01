package assignment170124;

import java.util.Arrays;

public class NumbAlphabetSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String input ="world is full of beautiful people";
          char b[]=input.toCharArray();
          int countofalpha=0;
          int countofspace=0;
          String alphabets="";
                  for(int i=0;i<input.length();i++) {
                  if(Character.isAlphabetic(b[i])) {
                          countofalpha++;
                          alphabets=alphabets+b[i];
                          
                  }
                  if(Character.isWhitespace(b[i])) {
                          countofspace++;
                  }
          
          }
                          
          System.out.println("Number of alpha in " +input+ " is "  +countofalpha);
          System.out.println("Number of space in " +input+ " is "  +countofspace);
          System.out.println("Before sorting:" +Arrays.toString(b));
          Arrays.sort(b);
          System.out.println("After sorting :" +Arrays.toString(b));
          System.out.println("The alphabets are :" +alphabets);
                          

  }
}


