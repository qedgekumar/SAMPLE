package may25;

public class Practise {

	public static void main(String[] args) {
		//prime number-number >1,numbers should not divisible by other numbers other than 1 and itself
		for(int i=1;i<=100;i++)
		{
			boolean isprime=true;
			if(i>1)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						isprime=false;
					}
				}
			}
			else
			{
				isprime=false;
			}
			if(isprime)
			{
				System.out.println(i+" ");
			}
		}

	}

}
