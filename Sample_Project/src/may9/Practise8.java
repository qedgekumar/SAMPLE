package may9;

import java.util.Arrays;
import java.util.Scanner;

public class Practise8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the arraysize");
		int arraysize=sc.nextInt();
		String[] arr1=new String[arraysize];
		for(int i=0;i<arraysize;i++)
		{
			arr1[i]=sc.next();
		}
		
		
		System.out.println("please enter the array size");
		int arrsize=sc.nextInt();
		String[] arr2=new String[arrsize];
		System.out.println("please enter the values");
		for(int i=0;i<arrsize;i++)
		{
			arr2[i]=sc.next();
			
		}
		System.out.println("Input1"+Arrays.toString(arr1));
		System.out.println("Input2"+Arrays.toString(arr2));
		String[] arr3=new String[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[i+arr1.length]=arr2[i];
		}
		System.out.println("output:"+Arrays.toString(arr3));
		sc.close();
		
		
		
		
		
		

	}

}
