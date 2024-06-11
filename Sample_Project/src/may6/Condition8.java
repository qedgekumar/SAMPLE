package may6;

import java.util.Scanner;

public class Condition8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter the day");
			String day=sc.next();
			switch(day.toLowerCase())
			{
			case "monday":
			case "tuesday":
			case "wendesday":
			case "Thursday":
			case "friday":
			
				System.out.println("it is a weekday");
				break;
				default :
					System.out.println("it is a weekend");
					break;
			}
		}

	}

}
