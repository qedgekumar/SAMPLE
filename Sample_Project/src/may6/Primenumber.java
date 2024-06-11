package may6;

public class Primenumber {

	public static void main(String[] args) {
		// prime numbers between 50 to 150
		int i=50;
		while(i<=150)
		{
			boolean prime=true;
			int divisor=2;
			while(divisor<=i/2)
			{
				if(i%2==0)
				{
					prime =false;
					break;
				}
				divisor++;
				
			}
			if(prime && i!=1)
			{
				System.out.println(i);
			}
			i++;
		}

	}

}
