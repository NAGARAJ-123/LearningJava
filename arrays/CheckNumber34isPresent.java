package arrays;

public class CheckNumber34isPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int rollno[]=new int[4];
          rollno[0]=98;
          rollno[1]=45;
          rollno[2]=34;
          rollno[3]=76;
          int myinput=34;
          
          for(int i=0;i<=3;i++)
          {
        	if ( myinput==rollno[i])
        	{
        		System.out.println("The given number is present");
        	}	
        	
          }
	}

}
