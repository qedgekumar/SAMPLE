package june9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		//swapping
		//int a=10,b=20;
		//System.out.println("Before swapping :"+a+"  "+b);
		/*int t=a;
		a=b;
		b=t;*/
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		/*a=a*b;
		b=a/b;
		a=a/b;*/
		/*a=a^b;
		b=a^b;
		a=a^b;*/
		//	b=a+b-(a=b);
		//System.out.println("After swapping :"+a+"  "+b);
		//Reverse number
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter given number");
		//int num=sc.nextInt();
		/*	int revnum=0;
		while(num>0)
		{
			revnum=revnum*10+num%10;
			num=num/10;

		}*/
		//StringBuffer sb=new StringBuffer(String.valueOf(num));
		//StringBuffer revnum=sb.reverse();
		//	StringBuilder sbl=new StringBuilder();
		//sbl.append(num);
		//StringBuilder revnum=sbl.reverse();
		//System.out.println("Reverse number is"+revnum);
		//Reverse string
		/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string:");
		String str=sc.next();
		String revstr="";
		/*int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}*/
		/*char c[]=str.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			revstr=revstr+c[i];
		}*/
		/*	StringBuffer sb=new StringBuffer(str);
		StringBuffer revstr1=sb.reverse();

		System.out.println("Reverse string is"+revstr1);*/
		//StringBuilder sbl=new StringBuilder(str);
		//StringBuilder revstr1=sbl.reverse();
		//System.out.println(revstr1);/*

		//palindromenumber
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter given number:");
		int num=sc.nextInt();
		int revnum=0;
		int org_num=num;
		while(num>0)
		{
			revnum=revnum*10+num%10;
			num=num/10;
		}
		if(org_num==revnum)
			System.out.println("Number is a palindrome...");
		else
			System.out.println("Number is not a palindrome...");*/

		//Palindrome string
		/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string:");
		String str=sc.next();
		String revstr="";
		String org_str=str;
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		if(org_str.equals(revstr))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string Not a palindrome");*/

		//count no of digits in a number
		/*	int num=123456;

		int count=0;
		while(num>0)

		{
			num=num/10;
			count++;
		}
		System.out.println("Count no of digits"+count);*/
		/*int num=124567;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count no of digits"+count);*/

		//count even and odd digits in a number
		/*int num=1234567;
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
	System.out.println("evencount"+even_count);
	System.out.println("oddcount"+odd_count);*/

		//sum of digits in a number
		/*int num=28527;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("sum of digits in a number"+sum);*/

		/*int num=27189;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of digits in a number:"+sum);*/

		//largest of numbers
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter Third number");
		int c=sc.nextInt();
		/*if(a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number");
		}
		else
		{
			System.out.println("c is largest number");

		}*/
		//Ternary operator
		/*int largest=c>(b>a?b:a)?c:(b>a?b:a);
		System.out.println("largest number is"+largest);
		sc.close();*/

		//fibonacci series
		/*	int n1=0;
		int n2=1;
		int sum=0;
		System.out.println(n1+" "+n2);
		for(int i=2;i<=10;i++)
		{
			sum=n1+n2;
			System.out.println(sum+" ");
			n1=n2;
			n2=sum;
		}*/
		//fibonacci series
		/*int n1=0,n2=1,sum=0;
		System.out.println(n1+"  "+n2);
		for(int i=2;i<=10;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;

		}*/
		//Remove junk special or characters
		/*String str="@#%^&*1234ASFGHHxcvbhjjj";
		String str1=str.replaceAll("[^a-zA-Z0-9]",  "");
		System.out.println(str1);*/

		//Remove white space characters
		/*String str="pavan kumar arisetti";
		String s=str.replaceAll("\\s", "");
		System.out.println(s);*/

		//count no of occurences in a string
		/*	String str="java selenium pavan arisetti";
		int count=str.length();
		int newcount=str.replace("a", "").length();
		int a=count-newcount;
		System.out.println("occurences"+a);*/
		/*	String str="java python clang pavan automation";
		int count=str.length();
		int ncount=str.replace("a", "").length();
		int occ=count-ncount;
		System.out.println(occ);*/

		//count words in a string
		/*String str="pavan kumar arisetti";
		int count=1;
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))

				count++;

		}
		System.out.println(count);*/

		//Reverse each word in a string
		/*	String str="pavan kumar arisetti";
		String revstr="";
		String words[]=str.split(" ");
		for(String w:words)
		{
			String revword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				 revword=revword+w.charAt(i);
			}
			revstr=revstr+revword+" ";

		}
System.out.println("Revstring is"+revstr);*/

		//approach 2
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter given string");
		String str=sc.nextLine();
		String revstr="";
		String words[]=str.split(" ");
		for(String w:words)
		{

			StringBuilder sb=new StringBuilder(w);
			StringBuilder revstr1=sb.reverse();
			revstr=revstr+revstr1+" ";

		}
		System.out.println(revstr);*/

		//sum of elements in array
		/*	int a[]= {1,5,7,9,3,4};
		int sum=0;
		for(int i=a.length-1;i>=0;i--) {
			sum=sum+a[i];
		}
		System.out.println(sum);*/

		//print even and odd numbers in array
		//int a[]= {2,4,6,9,1,3};
		/*System.out.println("Print even numbers...");
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("Print odd numbers in array");
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}*/
		/*System.out.println("Print even numbers...");
		for(int value:a)
		{
			if(value%2==0)
			System.out.println(value);
		}
		System.out.println("Print odd numbers...");
		for(int value:a)
		{
			if(value%2!=0)
				System.out.println(value);
		}*/
		//check two arrays equal or not
		/*int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,2};
		boolean flag=true;
		/*boolean status=Arrays.equals(a1, a2);
		if(status==true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");*/
		/*	if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
					flag=false;
			}


		}
		else
		{
			flag=false;

		}
		if(flag==true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");*/
		//	int a1[]= {1,2,3,4,5};
		//int a2[]= {1,2,3,4,5};
		/*boolean status=Arrays.equals(a1, a2);
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");

		}*/
		/*boolean status=true;
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
					status=false;
			}
		}
		else
			status=false;
		if(status==true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");*/
		//missing number in array
		/*int s[]= {1,2,3,5,6};
		int sum=0;
		for(int i=s.length-1;i>=0;i--)
		{
			sum=sum+s[i];

		}
		System.out.println(sum);
		int sum1=0;
		for(int i=0;i<=6;i++)
		{
			sum1=sum+i;
		}
		System.out.println(sum1);
		System.out.println("missing number is"+(sum1-sum));*/

		//missing number
		/*	int a[]= {1,2,3,4,6};
		int sum=0;
		for(int i=a.length-1;i>=0;i--)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		int sum1=0;
		for(int i=0;i<=6;i++)
		{
			sum1=sum1+i;
		}
		System.out.println(sum1);
		System.out.println("missing num"+(sum1-sum));*/

		//maximum and minimum elements in an array
		/*int a[]= {12,44,99,33,100,22};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);*/
		/*	int a[]= {22,99,223,111,8};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
	System.out.println(min);*/

		//Duplicate elements in array
		/*String arr[]= {"java","python","ruby","selenium","adf","python"};
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println("Duplicate Element found:"+arr[i]);
					flag=true;

			}
		}
		/*if(flag==false)
			System.out.println("Duplicate element not found...");*/
		//Duplicate element in array
		/*	String arr[]= {"java","python","sql","ruby","java"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Element found..."+arr[i]);
				flag=true;
			}
			}




		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found...");
		}*/
		//Linear search
		/*	int a[]= {2,4,8,9,12,99};
		boolean flag=false;
		int search_ele=a[3];
		for(int i=0;i<a.length;i++)
		{
			if(search_ele==a[i])
				System.out.println("search element is"+a[i]);
				flag=true;
		}
		if(flag==false)
			System.out.println("search element is not found...");*/

		//sorting elements
		/*	Integer a[]= {3,99,222,1111,888,444,22};
		System.out.println("Before sorting:"+Arrays.toString(a));
		//Arrays.parallelSort(a);
		//Arrays.sort(a);
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After sorting:"+Arrays.toString(a));*/

		//Bubble sort
		/*int a[]= {2,3,4,5,9,3,2,1,8};
		System.out.println("Before sorting:"+Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting:"+Arrays.toString(a));*/
		//Binary search
		/*	int a[]= {1,2,3,4,5,6,7,8,9,10};
		int key=6;
		int l=0;
		int h=a.length-1;
		boolean flag=false;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==key)
			{
				System.out.println("Element is found..");
				flag=true;
				break;
			}
			if(a[m]<key)
			{
				l=m+1;
			}
			if(a[m]>key)
			{
				h=m-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element is not found..");
		}*/

		//factorial number
		/*int num=5;
		long factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);*/

		/*int num=6;
		long factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of a number:"+factorial);*/

		//Approach 2 factorial
		/*int num=7;
		long factorial=1;
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);*/
		//approach2
		/*int num=4;
		long factorial=1;
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of a given number"+factorial);*/

		//prime number
		/*	int num=19;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
				if(count==2)
					System.out.println("Number is prime");
				else
					System.out.println("Number is not prime");

			}


		else
		{
			System.out.println("Not a prime number...");
		}*/

		//Whether given number prime or not
		/*int num=5;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("given no prime number ");}
			else {
				System.out.println("given no not a prime  ");}

		}
		else
		{
			System.out.println("Not  a prime number...");
		}*/

		//Random numbers
		//Random rand=new Random();
		//int rand_num=rand.nextInt(10);
		//Double rand_num=rand.nextDouble();
		//System.out.println(rand_num);
		//System.out.println(Math.random());

		//Prime numbers between  1 to 100
		/*	for(int i=1;i<=100;i++)
		{
			boolean isprime=false;
			if(i>1)
			{
				for(int j=2;j<=i;j++)
				{
					if(i%j==0)
					{
						isprime=false;
					}


				}

			}
			else
			{
				isprime=false;
			}
			if(isprime=true)
				System.out.println(i+" ");




		}*/

		//Prime numbers between 1 to 100
	/*	for(int i=1;i<=100;i++)
		{
			boolean isprime=true;
			if(i>1)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
						isprime=false;
				}

			}
			else
				isprime=false;
			if(isprime)
				System.out.println(i+" ");*/
			



		//}
		/*for(int i=1;i<=100;i++)
		{
			boolean isprime=true;
			if(i>1)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
						isprime=false;
				}
				
			}
			else
			{
				isprime=false;
			}
			if(isprime)
				System.out.println(i+" ");
		}*/
		
		//Armstrong number
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter given number:");
		int num=sc.nextInt();
		int org_num=num;
		int cubed_num=0;
		while(num>0)
		{
			int rem=num%10;
			cubed_num=cubed_num+(rem*rem*rem);
			num=num/10;
		
		}
		if(org_num==cubed_num)
			System.out.println("number is an armstrong number");
		else
			System.out.println("number is not an armstrong number");*/
		
		//pattern models
		
		/*for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i=0;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}*/
		
	/*	int alpha=65;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j));
			}
			System.out.println();
		}*/
		/*int alpha=65;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha));
				
			}
			alpha++;
			System.out.println();
		}*/
		int alpha=65;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)alpha+" ");
				
			}
			alpha++;
			System.out.println();
		}
		
		
		
		








	}

}
