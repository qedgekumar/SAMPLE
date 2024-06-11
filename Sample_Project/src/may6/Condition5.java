package may6;

import java.util.Scanner;

public class Condition5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter first number");
			int num1=sc.nextInt();
			System.out.println("Enter second number");
			int num2=sc.nextInt();
			
			System.out.println("addition operation");
			int sum=num1+num2;
		
			
			
			switch(0)
			{
			case 0:
				System.out.println("Addition of numbers"+sum);
				break;
				default:
					System.out.println("invalid");
					break;
			}
			
				
		}

	}

}
