package may11;

import java.util.Scanner;

public class S {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter given string");
		String input=sc.nextLine();
		String output=input.substring(input.lastIndexOf(".")+1,input.length());
		System.out.println("output:"+output);
		sc.close();
		

	}

}
