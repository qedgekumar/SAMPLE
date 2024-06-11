package may1;

import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		String arr[]= {"java","c","python","devops","javae"};
		boolean flag=false;
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found duplicate element:"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element is not found");
		}*/
		HashSet<String>lang=new HashSet<String>();
	for(String l:arr)
	{
		if(lang.add(l)==false)
		{
			System.out.println("Duplicate element is found"+l);
			flag=true;
		}
	}
	if(flag==false)
	{
		System.out.println("Duplicate element is not found");
	}

	}

}
