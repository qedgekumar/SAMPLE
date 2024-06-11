package may6;

public class Printprimenumbers {

	public static void main(String[] args) {
		// print prime numbers between 50 to 150
		int i=50;
		
		while(i<=150)
		{
			boolean isprime=true;
			int divisor=2;
			while(divisor<=i/2)
			{
				if(i%divisor==0)
				{
					isprime=false;
					break;
					
				}
				divisor++;
				
			}
			if(isprime && i!=1)
			{
				System.out.println(i);
				
			}
			i++;
		}
		

	}

}
