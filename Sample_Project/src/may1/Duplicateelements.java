package may1;

import java.util.HashSet;

public class Duplicateelements {

	public static void main(String[] args) {
	String arr[]= {"java","c","python","p","devops"};
	//Approach-1
/*	boolean flag=false;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("Found duplicate element"+arr[i]);
				flag=true;
			}
			
		}
	}
	if(flag==false)
	{
		System.out.println("Duplicate is not found");
	}*/
	boolean flag=false;
	HashSet<String>lang=new HashSet<String>();
	for(String l:arr)
	{
		if(lang.add(l)==false)
		{
			System.out.println("Found duplicate element:"+l);
			flag=true;
		}
	}
	if(flag==false)
	{
		System.out.println("Not duplicate element");
	}
	
	
	}

}
