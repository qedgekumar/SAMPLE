package feb29;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter your course");
			String course=s.next();
			switch(course.toUpperCase()) {
			case "MANUAL":
				System.out.println("course is available::"+course);
				break;
			case "SELENIUM":
				System.out.println("course is available::"+course);
				break;
			case "JAVA":
				System.out.println("course is available::"+course);
				break;
			case "SQL":
				System.out.println("course is available::"+course);
				break;
			case "PYTHON":
				System.out.println("course is available::"+course);
				break;
				default:
					System.out.println("course is not available::"+course);
					break;
			}
		}

	}

}
