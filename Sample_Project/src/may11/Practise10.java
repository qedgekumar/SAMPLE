package may11;

import java.util.Scanner;

public class Practise10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter given string");
		String input=sc.nextLine();
		char firstrepeatedchar=' ';
		char firstnonrepeatedchar=' ';
		for(int i=0;i<input.length();i++)
		{
			char tempchar=input.charAt(i);
			if(input.indexOf(tempchar)==input.lastIndexOf(tempchar))
			{
				if(firstnonrepeatedchar==' ')
					firstnonrepeatedchar=tempchar;
			}
			else if(firstrepeatedchar==' ')
			{
				firstrepeatedchar=tempchar;
			}
			if(firstrepeatedchar!=' '&&firstnonrepeatedchar!=' ')
				break;
			
		}
		sc.close();
		System.out.println("FirstRepeatedchar:"+firstrepeatedchar);
		System.out.println("FirstNonrepatedchar:"+firstnonrepeatedchar);

	}

}
