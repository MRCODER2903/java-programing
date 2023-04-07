// WAP TO FIND PERFECT SQR BETWEEN 1 TO 1000
package basicprograming;



public class PerfectSqrfrom1to1000
{
	
   public static void main(String[] args)
   {
		
		int n=1000;
		
		for( int i=1;i<=1000;i++)
		{
		 boolean c=false;
			for(int j=1;j*j<=i;j++)
			{
				if(j*j==i)
				{
					c=true;
					
					break;
				}
				
			}
			
			if(c==true)
			{
				System.out.println(i);
			
			}
		}

	}

}
