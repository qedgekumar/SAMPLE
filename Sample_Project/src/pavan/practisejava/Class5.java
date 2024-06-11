package pavan.practisejava;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		// verify given marks pass or fail
		Scanner s= new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			System.out.println("Enter your marks");
		int marks=s.nextInt();
		if (marks>=35) {
			System.out.println("pass=="+marks);
		} else {
			System.out.println("fail=="+marks);

		}

	}

}
}