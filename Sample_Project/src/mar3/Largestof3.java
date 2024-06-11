package mar3;

import java.util.Scanner;

public class Largestof3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter Third number");
		int c=sc.nextInt();
		/*if(a>b && a>c)
		{
			System.out.println(a+"is the largset number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+"is the largset number");
		}
		else
		{
			System.out.println(c+"is the largest number");
		}*/
		int largest1=a>b?a:b;
		int largest2=largest1>c?largest1:c;
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest+"is the largest number");
		

	}

}
