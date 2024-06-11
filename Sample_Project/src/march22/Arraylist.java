package march22;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String>arraylist1=new ArrayList<String>();
		arraylist1.add("Qedge");
		arraylist1.add("Technologies");
		arraylist1.add("pvt");
		arraylist1.add("Limited");
		//System.out.println(arraylist1);
		
		ArrayList<String>arraylist2=new ArrayList<String>();
		arraylist2.add("qedge");
		arraylist2.add("Technologies");
		arraylist2.add("Ameerpet");
		arraylist2.add("Hyderabad");
	//	System.out.println(arraylist2);
		
		ArrayList<String>arraylist3 =new ArrayList<String>();
		
		for (String each : arraylist1) {
			
			if(!arraylist3.contains(each))
			{
				
				arraylist3.add(each);
			}
			
		}
		
		for (String each : arraylist2) {
			
			if(!arraylist3.contains(each))
			{
				
				arraylist3.add(each);
			}
			
		}
		
		System.out.println(arraylist3);
		
	

	}

}
