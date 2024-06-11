package programs;

import java.util.Scanner;

public class Reversestr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a given string:");
		String str=sc.next();
		String rev=" ";
		//int len=str.length();
		
	/*	for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse string is:"+rev);*/
	/*	char[] ch=str.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("Reverse string"+rev);*/
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
		
		
		

	}

}
