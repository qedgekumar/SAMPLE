package dec1;

import java.util.Scanner;

public class Howtouserinputfromconsleusingscanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name?");
		String name= scanner.nextLine();
		System.out.printf("hey%s,how are you?\n",name);
		String status = scanner.nextLine();
		System.out.println("what is your age?");
		int age = scanner.nextInt();
		System.out.println("thankyou for giving information");
		scanner.close();
		
		

	}

}
