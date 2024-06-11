package apr3;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		//hasMmap derived from or implemented from map interface
		//All type of collections derived from collection interface but only the hashMap derived from map interface
		//In the Map interface or hashMap we can store the data in  the form of key and value pairs
		//The combination of key and value is called pair
		//keys should not repeat again,values should be repeated
		//keys should be different ,values should not be duplicated
		//it should not be in table
		/*HashMap - a class implememted Map interface
		  -----------------------------------------
		 1)Data can be stored in the form of key,value pairs
		 2)key is unique.But we can have duplicate values.
		 3)Insertion order not preserved(Index is not followed)
		 */
		
		//declaration
		//HashMap map=new HashMap();-here we can store any type of datatype
		//Map map=new HashMap();
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		//Adding pairs-put method is used
		hm.put(101, "john");
		hm.put(102, "scott");
		hm.put(103, "Mary");
		hm.put(104, "scott");
		hm.put(102, "David");
		
		System.out.println(hm);//{101=john, 102=David, 103=Mary, 104=scott}//old value replaced new value for key 102
        //curly braces representing list above line
		System.out.println("size of hashmap:"+hm.size());//4
		
		//remove pair
		hm.remove(103);//103 is the key of pair
		System.out.println("After removing pair:"+hm);//{101=john, 102=David, 104=scott}
		
		//Access value of the key -get method used
	
		System.out.println(hm.get(102));//102 is key //David
		
		//get all the keys from hash map-keysset() it will return all keys from hash map
		System.out.println(hm.keySet());//[101, 102, 104]
		
		//get all the values from hash map-hm.values()-it will return all values from hash map
		System.out.println(hm.values());//[john, David, scott]
		
		//retrieve key along with values-hm.entryset()-it will return keys along with values from hash map
		System.out.println(hm.entrySet());//[101=john, 102=David, 104=scott]
		//closed bracket representing set 
		//can we use different datatype in place of key-no-whatever the data we specified all the keys should have same datatype,all the values should be same datatype
		
		//Reading data from hash map -here also for loop is not possible because there is no indexing supported in hash map
		
       //Read the data using for ...each loop
	/*	for(int k:hm.keySet())
		{
			System.out.println(k+"   "+hm.get(k));
		}*/
		
		//using iterator-entry is nothing but combination of key and value-while loop only used
	               Iterator<java.util.Map.Entry<Integer,String>> it=hm.entrySet().iterator();
	               while(it.hasNext())
	               {
	            	   java.util.Map.Entry<Integer,String>entry=it.next();
	            	   System.out.println(entry.getKey()+"  "+entry.getValue());
	               }
	               
	               hm.clear();
	               System.out.println(hm);
	               System.out.println(hm.isEmpty());//true
	               
		
	}

}
