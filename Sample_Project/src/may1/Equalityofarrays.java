package may1;

import java.util.Arrays;

public class Equalityofarrays {

	public static void main(String[] args) {
		/*int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		boolean status=Arrays.equals(a, b);
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");

		}*/
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,8};
		boolean status=true;
		if(a1.length == a2.length)
		{
			for(int i=0;i<=a1.length-1;i++)
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
		}
			
		
		
		
		

	}

}
