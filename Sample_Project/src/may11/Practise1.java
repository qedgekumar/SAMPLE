package may11;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter given string:");
		String input=sc.nextLine();
		System.out.println("Input:"+input);
		String[] words=input.split(" ");
		String outputstring="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword +=word.charAt(j);
			}
			if(i!=words.length-1)
			outputstring +=reverseword+" ";
			else
				outputstring +=reverseword;
		}
		
		System.out.println("outputstring:"+outputstring);
		
			
	}

}
