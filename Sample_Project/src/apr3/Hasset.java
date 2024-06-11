package apr3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hasset {

	public static void main(String[] args) {
		/*HashSet - is a class implemented by set interface
		------------------------------------
		1)Heterogeneous data - allowed/homogeneous data allowed
        2)Insertion order -Not preserved (Index not supported)-it will follow hashing technique
        3)Duplicate elements-Not allowed
        4)Multiple nulls not allowed/only single null is allowed*/
        
		//Declaration-primitive types are not allowed any of the collection
		HashSet myset=new HashSet();//heterogeneous data
		//Set myset=new HashSet();//heterogeneous data
		//HashSet<String>myset=new HashSet<String>();//homogeneous data
		
		//adding elements into hash set
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		//printing hash set
		System.out.println(myset);//[null, A, 100, 10.5, welcome, true]
		
		//size of hashset
		System.out.println("size of hashset:"+myset.size());//6
		//if you want maintain insertion order array list is used ,i don't want duplicate and null values we can prefer hash set
		
		//Removing element-directly specify value ,in array list we specify index number
		myset.remove(10.5);//10.5 is value (not an index)
		System.out.println("After removing:"+myset);//[null, A, 100, welcome, true]
		
		//Inserting element-not possible because elements are not stored in proper order
		//if you have store the values in proper order then insertion is possible,if the elements storing in the random order where you want to insert -insertion is not possible in set collections
		//only we can add the values in end of the list
		
		//Accessing/retrieve specific element-not possible -elements are storing random order
		//indirect way we can access specific element first we can convert set collection into array list-access specific element is possible
		//Convert Hashset ->Array list
		ArrayList al=new ArrayList(myset);
		System.out.println(al);//[null, A, 100, welcome, true]
		System.out.println(al.get(2));
		
		//Read all the elements using -normal for loop is not possible-because there is no index-for loop specify index
		//Read all the elements-for each loop
		/*for(Object each:myset)
		{
			System.out.println(each);
		}*/
		//convert set to list at that time for loop is possible to read all the elements
		
		//using iterator
		/* Iterator it=myset.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }*/
		//In set coolection we cannot remove multiple values
		//clearing all the elements in the hash set
		myset.clear();
		System.out.println(myset);
		System.out.println(myset.isEmpty());//true
		
		
		
		
		
		
	
		
		
	}

}
