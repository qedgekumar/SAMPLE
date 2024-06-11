package may22;

import java.util.Scanner;

public class Practise4 {

	public static void main(String[] args) {
		// palindrome
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rev=0;
		int org_num=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev)
		{
			System.out.println("Palindrome"+org_num);
		}
		else
		{
			System.out.println("Not a palindrome"+org_num);
		}
		

	}

}
