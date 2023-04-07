// wap to find number is palindrom or not

package basicprograming;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no = ");
		int n=sc.nextInt();
		 int n1=n;
		 int r=0;
		 int d;
		  while(n !=0)
		  {
			  d=n%10;
			  r=r*10+d;
			  n=n/10;
		  }
		  
		  if(n1==r)
		  {
			  System.out.println(" palindrome number");
		  }
		  else
		  {
		  System.out.println("not a palindrome");
		  }
	}
		  
} 

