package apr3;

import java.util.Arrays;
import java.util.Scanner;

public class Scanneruserarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter a position value"+i+":");
			a[i]= s.nextInt();
			System.out.println("printing array elements...");
		}
		System.out.println(Arrays.toString(a));
		

	}

}
