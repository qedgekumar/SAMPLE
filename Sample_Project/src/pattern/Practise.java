package pattern;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter given day name");
		String dayname=sc.next();
		if(dayname.equalsIgnoreCase("monday")||dayname.equalsIgnoreCase("Tuesday")||dayname.equalsIgnoreCase("wendesday")||dayname.equalsIgnoreCase("Thursday")||dayname.equalsIgnoreCase("Friday"))
		{
			System.out.println("It is a weekday");
			
		}
		else
		{
			System.out.println("It is a weekend");
		}
		sc.close();*/
		//given number even or odd using switch
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter given number");
		int num=sc.nextInt();
		int remainder=num%2;
		switch(remainder)
		{
		case 0:
		System.out.println("even number");
		break;
		case 1:
			System.out.println("odd number");
		}
		sc.close();*/
		//perform arithmetic operation on two numbers
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("Enter operation");
		String operation=sc.next();
		int result=0;
		switch(operation)
		{
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		case "%":
			result=num1%num2;
			break;
			default:
				System.err.println("Invalid operation");
				break;
		}
		System.out.println(result);*/
		
		//weekday
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter dayname");
		String dayname=sc.next();
		sc.close();
		switch(dayname)
		{
		case "monday":
		case "tuesday":
		case "wendensday":
		case "thursday":
		case "friday":
			System.out.println("It is a weekday");
			break;
		case "saturaday":
		case "sunday":
			System.out.println("It is a weekend");
			break;
			default:
				System.err.println("Invalid dayname");
		}
		
		
		
		
		
	
		

	}

}
