// wap to check perfect no  in range 1 to 100

package basicprograming;

import java.util.Scanner;

public class Perfectnoinrange {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range = ");
		int n=sc.nextInt();
	for(int j=1;j<=n;j++)
	{
			int sum=0;
		for(int i=1;i<j;i++)
		{
			if(j%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==j)
		{
			 System.out.println(j);
		}
	}	
	}

}

