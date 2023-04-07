package basicprograming;
import java.util.*;

public class Factorial1 {
	
	public void fact(int x)
	{
		 int fact=1;
		 
		 for(int i=1;i<=x;i++)
		 {
			 fact=fact*i;
		 }
		 
		 System.out.println(fact);
	}

	public static void main(String[] args) {
		
		Factorial1 f=new Factorial1();
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("enter no = ");
		int n=sc.nextInt();
		f.fact(n);

	}

}
