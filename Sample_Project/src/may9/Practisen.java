package may9;

import java.util.Arrays;
import java.util.Scanner;

public class Practisen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the given array size");
		int arraysize=sc.nextInt();
		boolean[] arr=new boolean[arraysize];
		System.out.println("please enter the given values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextBoolean();
			
			
		}
		System.out.println("Input"+Arrays.toString(arr));
		boolean[] revarr=new boolean[arr.length];
		for(int i=0;i<revarr.length;i++)
		{
			revarr[arr.length-i-1]=arr[i];
		}
		System.out.println("output"+Arrays.toString(revarr));
		sc.close();
		

	}

}
