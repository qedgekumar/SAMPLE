package programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a given string:");
		String s=sc.next();
		sc.close();
		//String rev=" ";
	/*	int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string is"+rev);*/
	/*	char[] ch=s.toCharArray();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);*/
		StringBuffer sb=new StringBuffer(s);
	sb.reverse();
System.out.println(sb);	

	}

}
