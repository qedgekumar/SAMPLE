package june10;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given row number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i==n||i==1)
			System.out.println( "* ".repeat(n));
			else
				System.out.println("* "+"  ".repeat(n-2)+"*");
			
			
			
		}
		
	
		sc.close();

	}

}
