package june10;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given row number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("* ".repeat(i));
			
		}
		
		sc.close();
		
	}
}
