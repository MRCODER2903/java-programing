package basicprograming;

public class ArmstrongNoInRange {


	public static void main(String[] args) 
	{
		
        
        for(int i=1;i<=5000;i++)
        {
        	 int count=count(i);
        	 int n=i;
        	int sum=0;
        while(n!=0)
        {
        	int d=n%10;
            sum=sum+power(d,count);
            n=n/10;
        }
        
        
        if(sum==i)
        {
        	System.out.println(i+" is a amstrong no");	
        }
        
        }

	}
	
	public static int count(int n)                   // to find no of digit
	{
		int c=0;
		while(n!=0)
		{
			
			c=c+1;
			n=n/10;
			
		}
		return c;
	}
	
	public static int power(int num,int p)              // to find power 
	{
		int prod=1;
		
		for(int i=1;i<=p;i++)
		{
			prod=prod*num;
		}
		return prod;
	}

}
