package pavan.arraylist;

import java.util.ArrayList;

public class Class1 {

	public static void main(String[] args) {
		// store tata cars collection into arraylistclass
		ArrayList<String>cars=new ArrayList<String>();
		    cars.add("tata nexom");
		    cars.add("tata punch");
		    cars.add("tata harrier");
		    cars.add("tata tiago");
		    cars.add("tata tigor");
		    cars.add("tata safari");
		    cars.add("tata indica");
		    cars.add("tata nano");
		 //print collection number stored in arraylist class
		    System.out.println(cars.size());
		 //print specific position element value
		    System.out.println(cars.get(7));
		  //print each position value from collection
		    for(int i=0;i<cars.size();i++)
		    {
		    	System.out.println(cars.get(i));
		    }
		    

	}

}
