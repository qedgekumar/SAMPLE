package programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given number");
		int num=sc.nextInt();
		/*int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is"+rev);*/
		//using string buffer class
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse number is"+rev);*/
		//using string builder class
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder s=sbl.reverse();
		System.out.println("Reverse number is"+s);
		

	}

}
