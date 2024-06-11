package may25;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		boolean isprime=true;
		if(num>1)
		{
			for(int j=2;j<num;j++)
			{
				if(num%2==0)
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
			System.out.println("prime number"+num);
		else
			System.out.println("Not a prime number");

	}

}
