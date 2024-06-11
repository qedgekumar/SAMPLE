package pavan.arraylist;

import java.util.ArrayList;

public class Class2 {

	public static void main(String[] args) {
		//store cricketer names collection into arraylist class
		ArrayList<String>names=new ArrayList<String>();
		     names.add("rohitsharma");
		     names.add("subhamn gill");
		     names.add("virat kohli");
		     names.add("suryakumar");
		     names.add("klrahul");
		     names.add("jadeja");
		     names.add("kuldip yadav");
		     names.add("bumhrah");
		     names.add("shami");
		     names.add("siraj");
		     names.add("hardik");
		   //print collection number stored in arraylist class
		     System.out.println(names.size());
		   //print specific position element value 
		     System.out.println(names.get(5));
		   //print each position value from collection
		     for(int i=0;i<names.size();i++)
		     {
		     System.out.println(names.get(i));
		     
	}

}
}