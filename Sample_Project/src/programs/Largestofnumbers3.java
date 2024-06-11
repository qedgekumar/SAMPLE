package programs;

import java.util.Scanner;

public class Largestofnumbers3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
	/*	if(a>b && a>c)
		{
			System.out.println("largest num"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("largest num"+b);
		}
		else
		{
			System.out.println("largest number"+c);
		}*/
		
	/*	int largest=a>b?a:b;
		int largest1=largest>c?largest:c;
		System.out.println(largest1);*/
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("largest number is"+largest);
		

	}

}
