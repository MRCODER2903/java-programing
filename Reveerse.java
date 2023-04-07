// WAP TO REVERSE A NUMBER 

package basicprograming;


public class Reveerse {

	public static void main(String[] args)
	{
		
		int n=123;
		 int r=0;
		 int d;
		  while(n !=0)
		  {
			  d=n%10;
			  r=r*10+d;
			  n=n/10;
		  }
		  
		  System.out.println("reverse no is ="+r);
	}
}
