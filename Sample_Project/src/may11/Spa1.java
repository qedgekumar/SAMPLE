package may11;

import java.util.Scanner;

public class Spa1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter given string");
		String input=sc.nextLine();
		System.out.println("Input"+input);
		String outputstr="";
		if(getReverseString(input).equals(input))
			outputstr ="it is a palindrome";
		else
			outputstr ="it is not a palindrome";
		System.out.println("output"+outputstr);
		sc.close();
	}


		private static String getReverseString(String inputstring)
		{
			String reversestring="";
			for(int j=inputstring.length()-1;j>=0;j--)
			{
				reversestring +=inputstring.charAt(j);
			}
			return reversestring;
		}
		


	


}


