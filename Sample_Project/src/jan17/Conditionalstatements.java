package jan17;

import java.util.Scanner;

public class Conditionalstatements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("what is your online assessment status");
		String examstatus=scanner.nextLine();
		//String examstatus="pass";
		if(examstatus=="pass")
		{
			System.out.println("please wait for further rounds");
		}
		String round1status="pass";
		if(round1status=="fail")
		{
			System.out.println("you have cleared round1 interview,please wait for round 2 interview");
		}
		String round2status="pass";
		if(round2status=="fail")
		{
			System.out.println("You have cleared round2 interview,please wait for HR round");
		}
			
			
		else
		{
			System.out.println("you can goto home");
		}

	}

}
