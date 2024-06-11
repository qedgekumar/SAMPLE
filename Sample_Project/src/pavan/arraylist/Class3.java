package pavan.arraylist;

import java.util.ArrayList;

public class Class3 {

	public static void main(String[] args) {
		// store city names collection into arraylist class
		ArrayList<String>names=new ArrayList<String>();
                names.add("hyderabad");
                names.add("secunderabad");
                names.add("vizag");
                names.add("mumbai");
                names.add("calcutta");
                names.add("vzm");
                names.add("chennai");
                names.add("pune");
                names.add("bengalaru");
           //print collection number stored in arraylist class
                System.out.println(names.size());
           //print specific position element value
                System.out.println(names.get(4));
           for(int i=0;i<4;i++) 
           {
        	System.out.println(names.get(i));   

		       

	}

}
}