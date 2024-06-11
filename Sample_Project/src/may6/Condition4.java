package may6;

import java.util.Scanner;

public class Condition4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day name");
		String day=sc.next();
		if(day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("wendesday")||day.equalsIgnoreCase("Thrusday")||day.equalsIgnoreCase("friday"))
		{
			System.out.println("It is a weekday");
		}
		else
		{
			System.out.println("It is a weekend");
		}

	}

}
