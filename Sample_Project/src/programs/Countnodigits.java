package programs;

import java.util.Scanner;

public class Countnodigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a given number");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("count no of digits"+count);

	}

}
