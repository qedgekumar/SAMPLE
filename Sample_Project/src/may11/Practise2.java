package may11;

import java.util.Scanner;

public class Practise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter given string:");
		String input=sc.nextLine();
		String[] words=input.split(" ");
		String outputstring="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseword=getRevreseString(word);
			if(i%2==0)
				outputstring +=word.toUpperCase();
			else
				outputstring +=getRevreseString(word);
			if(i!=words.length-1)
				outputstring +=" ";
			
		}
		sc.close();
		System.out.println("outputstring:"+outputstring);
		
		

	}

	private static String getRevreseString(String inputstring) {
		String reversestring="";
		for(int j=inputstring.length()-1;j>=0;j--)
		{
			reversestring +=inputstring.charAt(j);
		}
		
		return reversestring ;
	}

}
