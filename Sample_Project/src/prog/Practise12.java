package prog;

import java.util.Scanner;

public class Practise12 {

	public static void main(String[] args) {
		//count of digits in a number
	/*	int num=123456;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count no of digits:"+count);*/
		/*int num=129045671;
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		
			
			
			
		}
		System.out.println("No of even digits"+even_count);
		System.out.println("No of odd digits"+odd_count);*/
		//sum of digits in a number
	/*	int num=89324;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("sum of digits"+sum);*/
		//largest number
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		System.out.println("Enter first number:"+a);
	
		int b=sc.nextInt();
		System.out.println("Enter first number:"+b);
		
		int c=sc.nextInt();
		System.out.println("Enter first number:"+c);
		if(a>b && a>c)
		{
			System.out.println("largest number"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest number:"+b);
		}
		else
		{
			System.out.println("Largest number");
		}
	
		
		

	}

}
