package may6;

import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student marks");
		int marks=sc.nextInt();
		if(marks<35)
		{
			System.out.println("student fail");
		}
		else if(marks==35)
		{
			System.out.println("student pass");
		}
		else if(marks>35 && marks<70)
		{
			System.out.println("third class");
		}
		else if(marks>70 && marks<85)
		{
			System.out.println("second class");
		}
		else
		{
			System.out.println("First class");
		}

	}

}
