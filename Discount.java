// find sum of even and odd digit then find product
package basicprograming;

public class Discount {
	
	public static void main(String[] args)
	{
		int n=2514795;
		int e_sum=0;
		int o_sum=0;
		while(n!=0)
		{
			int d=n%10;
			if(d%2!=0)
			{
			 o_sum=o_sum+d;
		    
			}
			else
			{
				e_sum=e_sum+d;
			}
		    n=n/10;
		}
		
		System.out.println("even sum = "+e_sum);
		System.out.println("odd sum  =  "+o_sum);
		int prod= o_sum*e_sum;
		System.out.println(prod);
	}

}
