package june10;

import java.util.Scanner;

public class Starpattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given rows");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(" ".repeat(n-i)+"*".repeat(i));
		}
		sc.close();

	}

}
