package prog;

import java.util.Scanner;

public class Practise3 {

	public static void main(String[] args) {
	/*Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
		
		int a=sc.nextInt();
		
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		
		System.out.println("Enter third number:");
		int c=sc.nextInt();*/
		
	/*	if(a>b && a>c)
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
		}*/
		//ternary operator
		//int largest=b>a?b:a;
		//int largest1=c>largest?c:largest;
		//System.out.println(largest1);
		//int largest=c>(b>a?b:a)?c:(b>a?b:a);
		//System.out.println(largest);
		int sum=0,n1=0,n2=1;
		System.out.println(n1+"  "+n2);
		for(int i=2;i<=10;i++)
		{
			sum=n1+n2;
			System.out.print(sum+"  ");
			n1=n2;
			n2=sum;
		}
	
		
		


	}

}
