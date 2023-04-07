// to check wether it is perfect square

package basicprograming;

import java.util.Scanner;

public class PerfectSqr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no = ");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i*i<=n;i++)
		{
			if(i*i==n)
			{
				c=c+1;
				System.out.println("sqr of = "+i);
				break;
			}
			
		}
		
		if(c==1)
		{
			System.out.println("perfecr sqr");
		
		}
		else
		{
			System.out.println("not a perfect sqr");
		}

	}

}
