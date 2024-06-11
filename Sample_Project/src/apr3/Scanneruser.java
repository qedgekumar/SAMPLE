package apr3;

import java.util.Scanner;

public class Scanneruser {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=s.nextInt();
		System.out.println("First number is"+num1);
		System.out.println("Enter second number:");
		int num2=s.nextInt();
		System.out.println("Second number is"+num2);
		System.out.println("Addition of two numbers is"+(num1+num2));
		System.out.println("Enter your name:");
		String name=s.next();
		System.out.println("Enter my name"+name);
		System.out.println("Enter your age:");
		int age=s.nextInt();
		System.out.println("Your age is:"+age);
		System.out.println("Enter unknown value:");
		Object value=s.next();
		System.out.println(value);
		
		

	}

}
