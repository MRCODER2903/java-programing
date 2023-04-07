// wap to display no is niven no or not
// no is divisible by sum of digit
//  126   ---> 1 2 6 ----> 1+2+6=9------> 126%9==0  that means it is niven no
package basicprograming;
public class Nivenno {

	public static void main(String[] args) {
		
		int n=126;
		int n1=n;
		int sum=0;
		  while(n !=0)
		  {
			int  d=n%10;
			  sum=sum+d;
			  n=n/10;
		  }
		  if(n1%sum==0)
		  {
			  System.out.println("niven no");
		  }
		  else
		  {
			  System.out.println("not a niven no");
		  }

	}

}
