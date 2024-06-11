package pavan.javalearn;

import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for( int i=1;i<=5;i++) {
			System.out.println("Enter your course");
			String course = s.next();
			switch (course.toUpperCase()) {
			case "MANUAl":
				System.out.println("course is available::"+course);

				break;
			case "SELENIUM":
				System.out.println("course is available::"+course);

				break;
			case "JAVA":
				System.out.println("course is available::"+course);

				break;
			case "AWS":
				System.out.println("course is available::"+course);

				break;
			case "python":
				System.out.println("course is available::"+course);

				break;
			default:  
				System.out.println("course is not available::"+course);
				break;
			}
		}		






	}



}


