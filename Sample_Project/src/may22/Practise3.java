package may22;

import java.util.Scanner;

public class Practise3 {

	public static void main(String[] args) {
		//Reverse a number
		//logic 1-using algorithm
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rev=0;
		/*while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
      System.out.println("Reverse number is:"+rev);*/
		//logic 2-stringbuffer
	/*	StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev1=sb.reverse();
		System.out.println("Reverse number is"+rev1);*/
		//logic 3-stringbuilder
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev1=sbl.reverse();
		System.out.println("Reverse number is:"+rev1);
		
		
	}

}
