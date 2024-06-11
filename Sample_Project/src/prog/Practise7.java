package prog;

import java.util.Scanner;

public class Practise7 {

	public static void main(String[] args) {
		//palindrome number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given number");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(org_num==rev)
		{
			System.out.println("Number is a palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
		
		

	}

}
