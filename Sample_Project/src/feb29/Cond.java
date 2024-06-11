package feb29;

import java.util.Scanner;

public class Cond {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter your marks");
			int marks=s.nextInt();
			if(marks>=32)
			{
				System.out.println("pass::"+marks);
			}
			else
			{
				System.out.println("fail::"+marks);
			}
		}

	}

}
