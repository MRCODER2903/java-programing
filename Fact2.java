package basicprograming;

public class Fact2 {

	public static void main(String[] args) {
	      
		int s=1;
		int e=10;
		int fact=1;

		for(int i=s; i<=e;i++)
		{
			fact=fact*i;
			
			 System.out.println("fact for  "+i+"  is  "+fact);
		}
	}

}
