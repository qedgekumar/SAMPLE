package pavan.javalearn;

import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=4;i++) {
			System.out.println("Enter your job");
			String job = s.next();
			switch (job.toUpperCase()) {
			case "TESTER":
				System.out.println("job available::"+job);
				
				break;
			case "DEVELOPER":
				System.out.println("job available::"+job);
				
				break;
			case "BANKER":
				System.out.println("job available::"+job);
				
				break;
			case "CLERK":
				System.out.println("job available::"+job);
				
				break;
			default:
				System.out.println("job not available::"+job);
				break;
			}
		}

	}

}
