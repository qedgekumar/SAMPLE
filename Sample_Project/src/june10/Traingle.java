package june10;

import java.util.Scanner;

public class Traingle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			
			System.out.println(" ".repeat(n)+"*".repeat(i));
		}
		sc.close();

	}

}
