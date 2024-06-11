package may22;

import java.util.Scanner;

public class Practise7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter second number");
	int b=sc.nextInt();
	System.out.println("Enter third number");
	int c=sc.nextInt();
/*	if(a>b && a>c)
	{
		System.out.println("largest number"+a);
	}
	else if(b>a && b>c)
	{
		System.out.println("largest number"+b);
	}
	else
	{
		System.out.println("largest number"+c);
	}*/
	//ternary operator
	/*int largest=a>b?a:b;
	int largest1=c>largest?c:largest;
	System.out.println("largest number is"+largest1);*/
	int largest2=c>(a>b?a:b)?c:(a>b?a:b);
	System.out.println("largest number is"+largest2);

	}

}
