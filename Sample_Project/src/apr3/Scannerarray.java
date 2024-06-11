package apr3;

import java.util.Arrays;
import java.util.Scanner;

public class Scannerarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int [5];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter a position value"+i+":");
			a[i]=s.nextInt();
			System.out.println("Printing array elements.....");
			System.out.println(Arrays.toString(a));
		}

	}

}
