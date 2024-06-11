package may11;

import java.util.Arrays;
import java.util.Scanner;

public class Practise6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the given string:");
		String input=sc.nextLine();
		String[] words=input.split(" ");
		String[] outputarr=new String[words.length/2];
		int index=0;
		for(int i=0;i<words.length;i++)
		{
			if(i%2 !=0)
			{
				outputarr[index]=words[i];
				index++;
			}
			
		}
		System.out.println("output"+Arrays.toString(outputarr));
		sc.close();
	}
}
