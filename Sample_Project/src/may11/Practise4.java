package may11;

import java.util.Scanner;

public class Practise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the given string:");
		String input=sc.nextLine();
		String[] words=input.split(" ");
		String outputstring="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseword=getReverseString(word);
			if(i !=words.length-1)
				outputstring +=reverseword+" ";
			else
				outputstring +=reverseword+" ";
				
		}
		System.out.println("outputstring"+outputstring);
		sc.close();
	}
		private static String getReverseString(String inputstring) {
			String reversestring="";
			for(int j=inputstring.length()-1;j>=0;j--)
			{
				reversestring +=inputstring.charAt(j);
			}
			return reversestring;
			
			
		

	

	
	}

}
