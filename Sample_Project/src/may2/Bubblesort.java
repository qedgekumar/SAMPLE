package may2;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int a[]= {1,3,2,9,8,4};
		System.out.println("Arrays Before sorting:"+Arrays.toString(a));
		int n=a.length-1;
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
		System.out.println("After sorting:"+Arrays.toString(a));
		
		

	}

}
