package programs;

public class PrimeNumber {

	public static void main(String[] args) {
	//whether given number is a prime number or not
		int num=19;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
				if(count==2)
				{
					System.out.println("Given number is a prime number");
				}
				else
				{
					System.out.println("Given number not a prime number");
				}
				
			
			
		}
		else
		{
			System.out.println("given number not a prime number");
		}

	}

}
