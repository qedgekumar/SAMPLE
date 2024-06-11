package mar2;

import java.util.Scanner;

public class Palindrome1 {

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
		//System.out.println("rev no is"+rev);
		if(rev==org_num)
		{
			System.out.println("number is a palindrome number"+org_num);
		}
		else
		{
			System.out.println("number is a not palindrome number"+org_num);
		}

	}

}
