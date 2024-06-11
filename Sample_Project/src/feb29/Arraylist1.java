package feb29;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<String>months=new ArrayList<String>();
		months.add("jan");
		months.add("feb");
		months.add("march");
		months.add("may");
		System.out.println(months.size());
		System.out.println(months.get(3));
		for(int i=0;i<months.size();i++)
		{
			System.out.println(months.get(i));
		}

	}

}
