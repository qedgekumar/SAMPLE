package june7;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int org_num=num;
		int cubednum=0;
		while(num>0)
		{
			int rem=num%10;
			cubednum=cubednum+(rem*rem*rem);
			num=num/10;
			
		}
		if(org_num==cubednum)
			System.out.println("armstrongnum");
		else
			System.out.println("Not a armstrong num");
		
sc.close();
	}

}
