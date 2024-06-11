package june10;

import java.util.Scanner;

public class Numberpattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given rows");
		int n=sc.nextInt();
		int alpha=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(alpha);
				alpha++;
			}
			System.out.println();
		}

	}

}
