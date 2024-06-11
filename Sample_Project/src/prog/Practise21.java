package prog;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Practise21 {

	public static void main(String[] args) {
		//Linear search
	/*	int a[]= {2,99,44,66,22,90};
		int search_element=90;
		boolean flag=false;
		for(int i=0;i<=a.length-1;i++)
		{
			if(search_element==a[i])
			{
				System.out.println("Element is found"+i);
				 flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}*/
		//Linear search
		/*int a[]= {10,20,30,40,50};
		int sear_ele=20;
		boolean flag=false;
		for(int i=0;i<=a.length-1;i++)
		{
			if(sear_ele==a[i])
			{
				System.out.println("Element is found"+i);
				flag=true;
				break;
			}
			
			}
		if(flag==false)
		{
			System.out.println("Element is not found:");
		}*/
		//Duplicate elements in array
	/*	String s[]= {"java","python","ruby","core","automation","python"};
		boolean flag=false;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println("Duplicate element found:"+s[i]);
					flag=true;
				}
				
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element is not found");
		}*/
		//hashset approach
	/*	String arr[]= {"java","python","ruby","c++","java"};
		HashSet<String>lang=new HashSet<String>();
		boolean flag=false;
		for(String l:arr)
		{
			//System.out.println(lang.add(l));
			if(lang.add(l)==false)
			{
				System.out.println("Duplicate element is found"+l);
				flag=true;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Duplicate element is not found");
		}*/
		//Arrays equal or not concept
		/*int a1[]= {2,3,4,5,6};
		int a2[]= {2,3,4,5,1};
		/*boolean status=Arrays.equals(a1, a2);
		if(status==true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");*/
		//approach 2
		/*boolean status=true;
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					status=false;
				}
			}
			
			
		}
		else
		{
			status=false;
		}
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}*/
		//Arrays equal or not
	//	int a1[]= {1,2,3,4,5};
		//int a2[]= {1,2,3,4,5};
		/*boolean status=Arrays.equals(a1, a2);
		if(status==true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");*/
	/*	boolean status=true;
		if(a1.length==a2.length)
		{
			status=true;
			for(int i=0;i<a1.length;i++)
			if(a1[i]!=a2[i])
				status=false;
		}
		else
			status=false;
		if(status==true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");*/
		//missing number in array
		/*int a[]= {1,2,4,5};
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		int sum2=0;
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
			System.out.println(sum2);
			System.out.println("missing number is"+(sum2-sum1));*/
		//max and min element in array
		/*int a[]= {20,30,90,100,33};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max element"+min);*/
		//bubble sort
	/*	int a[]= {2,44,99,21,87,1};
		System.out.println("Array Before sorting:"+Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
		}
		System.out.println("After sorting array"+Arrays.toString(a));*/
		//array sorting
	//	Integer a[]= {10,39,9,6,8,22};
		//Arrays.sort(a);
		//Arrays.parallelSort(a);
		//Arrays.sort(a,Collections.reverseOrder());
		//System.out.println("after sorting"+Arrays.toString(a));
	/*	int a[]= {2,7,8,9,4};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);*/
		/*int a[]= {2,4,5,6,7,9};
		int sum=0;
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println(sum);*/
		//even and odd numbers from array
	/*	int a[]= {2,7,8,9,3,6};
		System.out.println("print even numbers....");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Print odd numbers....");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}*/
		/*int a[]= {2,4,7,9,1,3};
		System.out.println("Print even numbers....");
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
				
			}
		}
		System.out.println("Print odd numbers....");
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}*/
	/*	int num=5;
		long factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
			System.out.println(factorial);*/
	/*	int num=6;
		long factorial=1;
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);*/
		//check whether given number prime or not
	/*	int num=11;
		int count=0;
	if(num>1)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
		
		
	}
	else
	{
		System.out.println("Not a prime number");
	}*/
		//prime numbers bw 1 to 100
	/*	for(int i=1;i<=100;i++)
		{
			boolean isprime=true;
			if(i>1) 
			{
				for(int j=2;j<i;j++)
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
			if(isprime)
			{
				System.out.println(i+" ");
			}
		}*/
		//prime numbers between 1 to 100
		for(int i=1;i<=100;i++)
		{
			boolean isprime=true;
			if(i>1)
			{
				for(int j=2;j<i;j++)
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
			if(isprime)
			{
				System.out.println(i+" ");
			}
			
		}
		
		
		

	}

}
