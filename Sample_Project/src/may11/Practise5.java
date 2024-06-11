package may11;

import java.util.Scanner;

public class Practise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter given string");
		String input=sc.nextLine();
		String[] words=input.split(" ");
		String maxlenword=words[0];
		for(int i=0;i<words.length;i++)
		{
			if(maxlenword.length()<words[i].length())
			{
				maxlenword=words[i];
			}
			
		}
		System.out.println("output"+maxlenword);
		sc.close();
		

	}

}
