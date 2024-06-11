package prog;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		/*int num=12345;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);*/
		//sum of digits
		/*int num=27832;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);*/
		//count even and odd digits
		/*int num=278329123;
		int even_count=0;
		int odd_count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
				even_count++;
			else
				odd_count++;
			num=num/10;
		}
		System.out.println("Even count"+even_count);
		System.out.println("Odd count"+odd_count);*/
		//fibonacci series
	/*	int sum=0,n1=0,n2=1;
		System.out.println(n1+"  "+n2);
		for(int i=2;i<=10;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			
		}*/
		//largest of 3 numbers
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();*/
	/*	if(a>b && a>c)
		{
			System.out.println("Largest number is"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest number is"+b);
		}
		else
		{
			System.out.println("Largest number is"+c);
		}*/
		//int largest=c>(b>a?b:a)?c:(b>a?b:a);
		//System.out.println(largest);
		/*String s="welcome@#$%%QWWERRGKJER8900!";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);*/
		/*String s="welcome pavan arisetti";
		s=s.replaceAll("\\s", "");
		System.out.println(s);*/
		//count no of occurences
		/*String s="welcome pavan selenium java java reasoning";
		int initcount=s.length();
		int fincount=s.replace("a", "").length();
		int count=initcount-fincount;
		System.out.println(count);*/
	/*	String s="welcome java automation";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		
		}
		System.out.println(count);*/
		//Reverse each letter in a word in string
	/*	String s="welcome pavan kumar arisetti";
		String words[]=s.split(" ");
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
		System.out.println(revstring);*/
		String s="pavan kumar arisetti";
		String revstring="";
		String words[]=s.split("\\s");
		for(String w:words)
		{
			StringBuffer sb=new StringBuffer();
			sb.append(w);
			sb.reverse();
			revstring=revstring+sb.toString()+" ";
			
		}
		System.out.println(revstring);
		
		
		

	}

}
