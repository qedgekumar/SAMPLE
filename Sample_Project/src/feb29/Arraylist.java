package feb29;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String>cars=new ArrayList<String>();
		cars.add("tata nexon");
		cars.add("tata mexon");
		cars.add("tata tiago");
		cars.add("tata safari");
		cars.add("tata nano");
		System.out.println(cars.size());
		System.out.println(cars.get(3));
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}

	}

}
