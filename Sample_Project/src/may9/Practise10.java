package may9;

import java.util.Arrays;
import java.util.Scanner;

public class Practise10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given arraysize");
		int arrsize=sc.nextInt();
		String[] s=new String[arrsize];
		System.out.println("please enter the array values");
		for(int i=0;i<arrsize;i++)
		{
			s[i]=sc.next();
			
		}
		System.out.println("Input"+Arrays.toString(s));
		String minlenword=s[0];
		int index=0;
		for(int i=0;i<s.length;i++)
		{
			if(minlenword.length()>s[i].length())
			{
				minlenword=s[i];
				index=i;
			}
				
		}
		System.out.println("minlengthword"+minlenword);
		System.out.println("minwordindex"+index);
		
		

	}

}
