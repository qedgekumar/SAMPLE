package feb29;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter your course name");
			String course=s.next();
			switch(course.toUpperCase()) {
			case "AWS":
				System.out.println("course is available"+course);
				break;
			case "PYTHON":
				System.out.println("course is available"+course);
				break;
			case "DOTNET":
				System.out.println("course is available"+course);
				break;
				default:
				
					System.out.println("course is not available"+course);
					break;
			}
			
		}

	}

}
