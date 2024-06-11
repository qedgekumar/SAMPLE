package june10;

import java.util.Scanner;

public class Diamondpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given rows");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			System.out.println(" ".repeat(n-i)+" *".repeat(i));
		}
		for(int i=n;i>=1;i--)
		{
			System.out.println(" ".repeat(n-i)+" *".repeat(i));
		}
		sc.close();

	}

}
