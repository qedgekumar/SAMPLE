package programs;

import java.util.Scanner;

public class Junkch {

	public static void main(String[] args) {
		/*String s="!@#$%9584ASDJFLasdee@@!!";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);*/
	/*	String s="!@#$%^09456ASDFGHancvfd";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);*/
		
		/*String s="pavan kumar arisetti selenum tester";
		String str=s.replaceAll("\\s", "");
		System.out.println(str);*/
		/*String s="automation tester in hyderabad in may month ";
		s=s.replaceAll("\\s", "");
		System.out.println(s);*/
		/*String s="pavan kumar arisetti automation in java selenium";
		int count=s.length();
		int total_count=s.replaceAll("a", "").length();
		int occure=count-total_count;
		System.out.println(occure);*/
		/*String s="pavan java python big data eng in may";
		int count=s.length();
		int total_count=s.replaceAll("a", "").length();
		int countoccu=count-total_count;
		System.out.println(countoccu);*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string:");
		String s=sc.nextLine();
		sc.close();
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
				
				
			}
		}
		System.out.println("No of words in string:"+count);*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string:");
		String s=sc.nextLine();
		sc.close();
		int count=1;
		for(int i=0;i<=s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
				
			}
				
		}
		System.out.println("No of words in a string"+count);*/
		//Reverse each word in a string
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string:");
		String s=sc.nextLine();
		sc.close();
		String[] words=s.split(" ");
		String revstring="";
		for(String w:words)
		{
			String revword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revword=revword+w.charAt(i);
				
			}
			revstring=revstring+revword+" ";
		}
		System.out.println("Reverese string"+revstring);*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string:");
		String s=sc.nextLine();
		sc.close();
		String[] words=s.split("\\s");
		String revstring="";
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			revstring=revstring+sb.toString()+" ";
			
			
		

		}
		System.out.println(revstring);*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string");
		String s=sc.nextLine();
		sc.close();
		String revstring="";
		String[] words=s.split(" ");
		for(String w:words)
		{
			String revword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revword=revword+w.charAt(i);
			}
			revstring=revstring+revword+" ";
		}
		System.out.println(revstring);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string:");
		String s=sc.nextLine();
		sc.close();
		String revstring="";
		String[] words=s.split("\\s");
		for(String w:words)
		{
			
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			revstring=revstring+sb.toString()+" ";
			
		}
	System.out.println("reverse string"+revstring);
		
		}

}
