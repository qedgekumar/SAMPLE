package apr30;

import java.util.Scanner;

public class Largestofnumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number");
	int a=sc.nextInt();
	
	System.out.println("Enter Second number");
	int b=sc.nextInt();
	
	System.out.println("Enter Third number");
	int c=sc.nextInt();
	/*if(a>b && a>c)
	{
		System.out.println(" largest number is"+a);
	}
	else if(b>a && b>c)
	{
		System.out.println("largest number is"+b);
	}
	else
	{
		System.out.println("largest number is "+c);
	}*/
	//Ternary operator
	//int largest1=a>b?a:b;
	//int largest2=largest1>c?largest1:c;
	int largest=c>(a>b?a:b)?c:(a>b?a:b);
	System.out.println("largest number is "+largest);
		
	
	

	}

}
