package mar3;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+"is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+"is largest number");
		}
		else
		{
			System.out.println(c+"is largest number");
		}
		

	}

}
