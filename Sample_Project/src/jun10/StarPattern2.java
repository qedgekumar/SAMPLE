package jun10;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		
		for (int i = 1; i <=n; i++) {
			System.out.println(" ".repeat(n-i)+"* ".repeat(i));
		}

	}

}
