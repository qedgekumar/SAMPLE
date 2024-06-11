package may25;

import java.util.Scanner;

public class Practise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given number:");
		int num=sc.nextInt();
		sc.close();
		boolean isprime=true;
		if(num>1)
		{
			for(int i=2;i<num;i++)
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
			System.out.println("given num prime no"+num);
		else
			System.out.println("given number not a prime number");

	}

}
