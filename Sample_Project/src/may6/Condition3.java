package may6;

import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter given number");
			int num=sc.nextInt();
			switch(num % 2)
			{
			case 0:
				System.out.println("Even no");
				break;
			case 1:
				System.out.println("odd no");
				break;
				default :
					System.out.println("Invalid input");
					break;
			}
			
			
		}
				
				
			
		

	}

}
