package pavan.javalearn;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// verify given marks pass or fail
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter your marks");
		int marks = s.nextInt();
		if (marks>=28) {
			System.out.println("pass::::"+marks);
		} else {
         System.out.println("fail::::"+marks);
		}
		
			
			

		}	

}
}