package programs;

import java.util.Scanner;

public class Pri {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter given no");
		int num=sc.nextInt();
	sc.close();
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
				System.out.println("prime no");
			else
				System.out.println("Not a prime no");
			
		}
		else
		{
			System.out.println("Not a prime no");
		}

	}

}
