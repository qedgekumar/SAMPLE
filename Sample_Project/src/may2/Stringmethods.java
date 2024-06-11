package may2;

import java.util.Scanner;

public class Stringmethods {

	public static void main(String[] args) {
	//String s="!!!@@###$$$%%8888444hhjjkkk";
	//s=s.replaceAll("[^a-zA-Z0-9]", "");
//	System.out.println(s);
	/*	String s="java  selenium  python  c";
		System.out.println("Before removing white spaces"+s);
		s=s.replaceAll("\\s", "");
		System.out.println("After removing white spaces"+s);*/
		/*String s="pavan kumar java python selenium";
		System.out.println("Before removing:"+s);
		int count=s.length();
		System.out.println(count);
		int afrcount=s.replace("a", "").length();
		System.out.println("After removing"+afrcount);*/
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("no of words"+count);

		
	}
	}
	
	



