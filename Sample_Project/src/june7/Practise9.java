package june7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practise9 {

	public static void main(String[] args) throws Throwable {
		/*FileWriter fw=new FileWriter("");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("selenium with java");
		bw.write("automation testing");
		bw.write("automation python");
		System.out.println("finished..");
		bw.close();*/
		
		//how to read data from text file
		/*FileReader fr=new FileReader("");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str =br.readLine())!=null)
		{
			System.out.println(str);
			
		}
		br.close();*/
		//approach 2
		File file=new File("");
		Scanner sc=new Scanner(file);
		/*while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}*/

		//approach3
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
	}

}
