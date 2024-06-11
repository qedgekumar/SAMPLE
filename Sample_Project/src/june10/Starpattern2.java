package june10;

import java.util.Scanner;

public class Starpattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row numbeer");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(" ".repeat(n-i)+"*".repeat(i));
		}
		sc.close();

	}

}
