package may9;

import java.util.Arrays;
import java.util.Scanner;

public class Practise6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the arraysize:");
		int arraysize=sc.nextInt();
		int[] arr=new int[arraysize];
		System.out.println("plesae enter the array values");
		for(int i=0;i<arraysize;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Input"+Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum +=arr[i];
			
		}
		System.out.println("output"+sum/arr.length);
		
		sc.close();

	}

}
