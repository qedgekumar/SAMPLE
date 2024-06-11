package may11;

import java.util.Scanner;

public class Spracise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first string");
		String input1=sc.nextLine();
		System.out.println("Input1"+input1);
		System.out.println("please enter the second string");
		String input2=sc.nextLine();
		System.out.println("Input2"+input2);
		String output="";
	/*	for(int i=0;i<input1.length();i++)
		{
			char tempchar=input1.toLowerCase().charAt(i);
			if(input2.toLowerCase().indexOf(tempchar)>=0)
			{
				output +=input1.charAt(i);
			}
			else
			{
				output +="+";
			}
		}
		System.out.println("output"+output);*/
		output=input2+","+input1.charAt(0);
		System.out.println("output"+output);
		sc.close();
		
		
		

	}

}
