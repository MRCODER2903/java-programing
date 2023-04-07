// armstrong no ---> sum of each digit raised to total no of digit 
// 153-->  1^3 +5^3 + 3^3 =153  armstrong no
// count digit
//separate
//power
//sum
//compare
//
package basicprograming;

public class ArmstrongNo {
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		
        int n=153;
        int n1=n;
        int sum=0;
        
        
        while(n!=0)
        {
        	int d=n%10;
            sum=sum+power(d,count(n1));
            n=n/10;
        }
        
        
        if(sum==n1)
        {
        	System.out.println(n1+" is a amstrong no");	
        }
        else
        {
        	System.out.println(n1 +" not a amtrong no");
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
