package may22;

import java.util.Scanner;

public class Practise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		String rev="";
		int len=str.length();
	/*	for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reverse string is:"+rev);*/
		//using char array
		/*char ch[]=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("reverse string :"+rev);*/
		//logic3 -stringbffer
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
		

	}

}
