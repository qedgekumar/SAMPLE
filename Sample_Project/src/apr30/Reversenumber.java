package apr30;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		/*int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}*/
	/*	StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println("Reverse string is"+rev);*/
		
		StringBuilder rev;
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		rev=sbl.reverse();
		System.out.println("Reverse number is"+rev);

	}

}
