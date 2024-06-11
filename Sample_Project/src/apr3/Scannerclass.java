package apr3;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		System.out.println("Given number is"+num);
		
		System.out.println("Enter a number:");
		Double d=s.nextDouble();
		System.out.println("Given number is"+d);
		
		System.out.println("Enter a string:");
		String city=s.next();
		System.out.println("Given city is"+city);

	}

}
