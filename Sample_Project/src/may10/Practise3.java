package may10;

import java.util.Scanner;

public class Practise3 {

	public static void main(String[] args) {
		// reversestring
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the given string:");
		String input=sc.nextLine();
		String reversestring=new String();
		for(int i=input.length()-1;i>=0;i--)
		{
			reversestring+=input.charAt(i);
		}
		System.out.println(reversestring);
sc.close();
	}

}
