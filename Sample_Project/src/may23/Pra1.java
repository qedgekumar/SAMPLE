package may23;

import java.util.Scanner;

public class Pra1 {

	public static void main(String[] args) {
		       //count words in a string
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string:");
				String s=sc.nextLine();
				int count=1;
				for(int i=0;i<=s.length()-1;i++)
				{
					if((s.charAt(i)==' ')&& s.charAt(i+1)!=' ')
								
						count++;
					
					
				}
				System.out.println("No of words in a string"+""+count);

			

		


	}

}
