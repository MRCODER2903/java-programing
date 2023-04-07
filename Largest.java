// find largest in number
package basicprograming;

public class Largest {

	public static void main(String[] args)
	{
	int n=-345623;
	int larg=-9;              // no can be in -ve so initialise with lowest number possible
	while(n!=0)
	{
		int d=n%10;
		if(d>larg)
		{
		 larg=d;
	    
		}
	    n=n/10;
	}
	System.out.println(larg);
	}

}
