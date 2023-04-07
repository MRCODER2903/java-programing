// wap to check perfect no or not
// 6 has factor 1 2 3 6 exclude 6  find sum 1+2+3=6 perfect no


package basicprograming;

import java.util.Scanner;

public class Perfectno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no = ");
		int n=sc.nextInt();
		int sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	
	if(sum==n)
	{
		 System.out.println("perfect no");
	}
	else
	{
		 System.out.println("not a perfect no");
	}
	
	
	
	}

}
