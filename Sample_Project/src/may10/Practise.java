package may10;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the given string");
		String input=sc.nextLine();
		System.out.println("Enter target character:");
		char targetchar=sc.next().charAt(0);
		System.out.println("Input"+input);
		System.out.println("Targetedchar"+targetchar);
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==targetchar)
			
				count++;
			
		}
		System.out.println("No of occurences"+count);
		

	}

}
