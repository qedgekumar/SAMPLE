package apr3;

import java.util.Arrays;
import java.util.Scanner;

public class Scannerstring {

	public static void main(String[] args) {
		int a[]=new int [5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter a position value"+i+":");
			a[i]= s.nextInt();
			System.out.println("printing array elements....");
		}
		System.out.println(Arrays.toString(a));
		
		

	}

}
