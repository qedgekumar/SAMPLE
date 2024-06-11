package apr30;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
	//A Palindrome string is a string that remains the same when its characters are reversed.
		//Like MADAM
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		String org_str=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		if(org_str.equals(rev))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("Not a palindrome String");
		}
		
		

	}

}
