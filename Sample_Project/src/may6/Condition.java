package may6;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("number is even no");
			
		}
		else
		{
			System.out.println("number is odd no");
		}

	}

}
