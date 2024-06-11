package june10;

import java.util.Scanner;

public class Starpattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given rows");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.println(" ".repeat(n-i)+"* ".repeat(i));
			
		}
		sc.close();

	}

}
