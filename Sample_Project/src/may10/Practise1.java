package may10;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the given string:");
		String input=sc.nextLine();
		System.out.println("Input"+input);
		System.out.println("Enter target character:");
		char targetchar=sc.next().charAt(0);
		System.out.println("Input"+input);
		System.out.println("Targeted char"+targetchar);
		char[] characters=input.toCharArray();
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(characters[i]==targetchar)
			count++;
		}
		System.out.println("No of occurences is"+count);

	}

}
