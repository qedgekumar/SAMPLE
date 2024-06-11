package programs;

import java.util.HashSet;

public class Arraysum {

	public static void main(String[] args) {
	/*	int a[]= {2,3,4,7,8};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements"+sum);*/
	/*	int a[]= {2,3,9,7,6};
		int sum=0;
		for(int value:a)
		{
			sum=sum+value;
			
		}
		System.out.println("sum of elements"+sum);*/
	/*	int a[]= {3,4,9,8,4};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements"+sum);*/
		/*int a[]= {4,8,3,9,8};
		int sum=0;
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("sum of elements"+sum);*/
		/*int a[]= {1,2,3,6,9,5};
		System.out.println("print even numbers in array:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		}
		System.out.println("Print odd numbers in array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}*/
	/*	int a[]= {2,3,5,9,6,8};
		System.out.println("print even numbers");
		for(int value:a)
		{
			
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		System.out.println("print odd numbers");
		for(int value:a)
		{
			
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}*/
		//linear search
		/*int a[]= {2,9,4,6,8};
		int search_element=4;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(search_element==a[i])
			{
				System.out.println("Element found at"+i);
				flag=true;
				break;
			}
		}if(flag==false)
		{
			System.out.println("Element Not found");
			
		}*/
		//linear search
		/*int a[]= {3,4,5,6,9,2};
		int search_element=6;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
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
			System.out.println("Element Not found");
		}*/
		//duplicate elements
		/*String[] s= {"java","python","ruby","clan","mainfr","java","sql","ruby"};
		boolean flag=false;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println("Duplicate Element is found"+s[i]);
					flag=true;
					
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate Element not found");
		}*/
		//hasset
		/*String[] s= {"java","python","ruby","clan","mainfr","java","sql","ruby"};
		boolean flag=true;
		HashSet<String>lang=new HashSet<String>();
		for(String l:s)
		{
			if(lang.add(l)==false)
			{
				System.out.println("Duplicate element found"+l);
				flag=true;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}*/
	/*	int a[]= {3,5,8,9,4,1};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max elemnet is:"+max);*/
	/*	int a[]= {4,8,9,2,3};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min element"+min);*/
		//missing number in array
		//array should not have duplicates,array no need to be sorted order,values should be in range
		int a[]= {1,2,4,5};
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
		
		System.out.println("missingnum"+(sum2-sum1));
		
   

	}

}
