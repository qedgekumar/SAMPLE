package apr11;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string:");
		String str=sc.next();
		String revstr="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		System.out.println(revstr);
		

	}

}
