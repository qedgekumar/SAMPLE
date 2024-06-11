package may9;

import java.util.Arrays;
import java.util.Scanner;

public class Practise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the arraysize:");
		int arrsize=sc.nextInt();
		int[] arr=new int[arrsize]; 
		System.out.println("please enter the array values:");
		for(int i=0;i<arrsize;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Input:"+Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum +=arr[i];
		}
		System.out.println("output"+sum);
	
		sc.close();

	}

}
