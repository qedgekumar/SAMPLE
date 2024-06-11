package june10;

import java.util.Scanner;

public class Numberpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given rows");
		int n=sc.nextInt();
		
		String str = "";
		for (int i = 1; i <= n; i++) {
			str += i;
			System.out.println(str);
		}
		sc.close();
	}

}
