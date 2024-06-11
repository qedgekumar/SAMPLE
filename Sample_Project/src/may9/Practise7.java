package may9;

import java.util.Arrays;
import java.util.Scanner;

public class Practise7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter given arraysize");
		int arraysize=sc.nextInt();
		int[] a=new int [arraysize];
		System.out.println("please enter the given values");
		for(int i=0;i<arraysize;i++)
		{
			a[i]=sc.nextInt();
			
			
		}
		System.out.println("Input"+Arrays.toString(a));
		int largestno=a[1];
		int index=1;
         for(int i=0;i<a.length;i++)
         {
        	 if(largestno<a[i])
        	 {
        		 largestno=a[i];
        		 index=i;
        	 }
        	 
         }
         System.out.println("largestno"+largestno);
         System.out.println("index"+index);
         sc.close();
	}

}
