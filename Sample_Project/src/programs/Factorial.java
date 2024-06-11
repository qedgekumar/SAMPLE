package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//int num=5;
		//long factorial=1;
	/*	for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial of number"+factorial);*/
		/*for(int i=num;i>1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial of a number"+factorial);*/
		int num=5;
		long factorial=1;
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial no"+factorial);
		

	}

}
