package may11;

import java.util.Scanner;

public class Practise9 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the given string:");
	String input=sc.nextLine();
	System.out.println("Input:"+input);
	int uppercase=0;
	int lowercase=0;
	int digits=0;
	int specialchar=0;
	
		char[] characters=input.toCharArray();
		for(char ch:characters)
		{
			if(Character.isUpperCase(ch))
				uppercase++;
			else if(Character.isLowerCase(ch))
               lowercase++;
			else if(Character.isDigit(ch))
				digits++;
			else
				specialchar++;
			
			
		
	}
		System.out.println("uppercasecount:"+uppercase);
		System.out.println("lowercasecount:"+lowercase);
		System.out.println("digitscount:"+digits);
		System.out.println("specialcharcount:"+specialchar);
		sc.close();

	}

}
