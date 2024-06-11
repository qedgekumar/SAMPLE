package may11;

import java.util.Scanner;

public class Practise7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the given string:");
		String input=sc.nextLine();
		System.out.println("Input"+input);
		char firstrepeatedchar=' ';
		char firstnonrepeatedchar=' ';
		for(int i=0;i<input.length();i++)
		{
			char tempchar=input.charAt(i);
			if(input.indexOf(tempchar)==input.lastIndexOf(tempchar))
			{
				if(firstrepeatedchar==' ')
					firstnonrepeatedchar=tempchar;
			}
			else if(firstrepeatedchar==' ')
			{
				firstrepeatedchar=' ';
				firstrepeatedchar=tempchar;
				
			}
			if(firstnonrepeatedchar!=' '&&firstrepeatedchar !=' ')
			{
				break;
			}
			
			
		}
		sc.close();
		System.out.println("Firstrepeatedchar"+firstrepeatedchar);
		System.out.println("Firstnonrepeatedchar"+firstnonrepeatedchar);

	}

	
		
	

}
