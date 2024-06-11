package june7;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		//arm strong number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int org_num=num;
		int cubed_num=0;
		while(num>0)
		{
			int rem=num%10;
			cubed_num=cubed_num+(rem*rem*rem);
			num=num/10;
			
		}
		if(org_num==cubed_num)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}
		sc.close();

	}

}
