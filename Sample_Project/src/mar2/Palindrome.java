package mar2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==org_num)
		{
			System.out.println(org_num+"palindrome number");
		}
		else
		{
			System.out.println(org_num+"Not a palindrome number");
		}
		

	}

}
