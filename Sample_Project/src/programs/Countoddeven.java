package programs;

import java.util.Scanner;

public class Countoddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a given number");
		int num=sc.nextInt();
		sc.close();
		int even_count=0;
		int odd_count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
			}
			else
			{
				odd_count++;
				
			}
			num=num/10;
		}
     System.out.println("even count"+even_count);
     System.out.println("odd count"+odd_count);
	}

}
