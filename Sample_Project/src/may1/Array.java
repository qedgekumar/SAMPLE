package may1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
	/*	boolean status=Arrays.equals(a, b);
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}*/
		boolean status=true;
		if(a.length==b.length)
		{
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]!=b[i])
				{
					status=false;
				}
			}
			
		}
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		

}
}
