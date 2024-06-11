package programs;

import java.util.Scanner;

public class PalindromeStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a given string:");
		String s=sc.next();
		sc.close();
		String rev=" ";
		String org_str=s;
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(org_str.equals(rev))
		{
			System.out.println("Palindromestring:"+org_str);
		}
		else
		{
			System.out.println("Not a palindome string:"+org_str);
		}

	}

}
