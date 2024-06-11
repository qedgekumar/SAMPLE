package apr11;

import java.util.Scanner;

public class Pract {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string");
		String str=sc.nextLine();
		String revstr="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		System.out.println(revstr);
		sc.close();*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		

	}

}
