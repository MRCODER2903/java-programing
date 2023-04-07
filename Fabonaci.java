// wap to dislpay first 10 fibonaccie series

package basicprograming;

public class Fabonaci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
        int c=0;
        System.out.print(a+" "+b+" ");
		for(int i=1; i<=8;i++)                         // two digit already displayed
		{
			
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}

	}

}
