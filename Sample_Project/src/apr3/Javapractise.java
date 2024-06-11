package apr3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Javapractise {

	public static void main(String[] args) {
		//collection - To represent group of elements/objects/data  into single entity
		//"collection" is an interface available in java.util
		/*ArrayList - is class which is implemented by List interface
		1)Heterogeneous data - allowed
        2)Insertion order -preserved(Index)-it will follow index -index starts from zero
        3)Duplicate elements - allowed
        4)multiple nulls -allowed-unknown value or unknown objects-null is nothing but empty means unknown value*/
		//Homogeneous means same type of data,heterogeneous means different type of data 
        //Array list allows both homogeneous  and heterogeneous data
		//when you are working with primitive types  we use arrays we use primitive type of data,when you are working with array list we use object type of data
		//in normal arrays array size is fixed,In array list is dynamic we don't need to specify any size we can keep adding more number of objects
		//insertion order is preserved means in whichever order we have stored the elements in the same order it will maintain but in hashing it will not maintain the same order so in whichever order we have added the data
		//index is a kind of algorithm to store the data,to store the data in memory two kinds of algorithms are there one is indexing,second one is hashing
		//indexing is nothing but data will be stored in the same place in particular order,hashing is nothing but elements will be stored in the different places in the memory there is no proper order maintained wherever the memory is free it will go and store that objects
        //in indexing technique elements will be stored in the sequential memory 
		//Array,array list use indexing technique,hash set,hash map use hashing technique
		
		//Declaration
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		//ArrayList<String>mylist =new ArrayList<String>();
		
		//Adding data into array list
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		
		//size of an array list
		System.out.println("size of an arraylist:"+mylist.size());//8
		
		//printing array list
		System.out.println("printing data from an arraylist:"+mylist);//[100, 10.5, welcome, A, true, 100, null, null]
        
		//Remove element from an arraylist
        	mylist.remove(5);//here  5 is index of element
        	System.out.println("After removing:"+mylist);//[100, 10.5, welcome, A, true, null, null]
		
        	//insertion is nothing but middle of  or somewhere in the array list,adding is nothing but value is added at the end
        	//insertion is nothing but we can insert the value in middle of the list,Adding is nothing but we can add the values at the end of the list
        	//Insertion -we can provide value along with index,In Adding we can provide only value
        	//Insert element into array list
        	mylist.add(2, "java");
        	System.out.println("After insertion:"+mylist);//[100, 10.5, java, welcome, A, true, null, null
            
        	//Modify element into array list(modify/replace/change)
        	mylist.set(2, "python");
        	System.out.println("After replacing:"+mylist);//[100, 10.5, python, welcome, A, true, null, null]
		
        	//Access specific element from an array list
        	mylist.get(3);
        	System.out.println(mylist.get(3));//here 3 is index // welcome
        	
        	//Reading all the elements from an array list
        	
        	//using normal for loop
        	
        /*	for(int i=0;i<mylist.size();i++)
        	{
        		System.out.println(mylist.get(i));
        		
        	}*/
        	
        	//using for each loop,object type can hold different types of data
        	/*for(Object each:mylist)
        	{
        		System.out.println(each);
        		
        	}*/
        	
        	//by using iterator-it is a cursor
        	//Iterator it =mylist.iterator();
        	//System.out.println(it.next());//alone it will return only first value//100
        	//whenever using iterator we prefer to use while loop because how much of data in array list don't know
        	//how much of data you know we use for ,for each loop
        	//hasnext()-this method will check element is present or not it will not follow indexing number 
        	//iterate the list one by one just like a for each loop
        	//hasnext navigate to array list here
        	/*while(it.hasNext())
        	{
        		
        		System.out.println(it.next());
        	}*/
        	//iterator prefer while loop because we don't know how much of data we have in this array list ,array list is dynamic 
        	//it.next is a method get the particular value from array list,has next is a method it will check element is present  or not in array list
        	
        	/*String m1()
        	{
        		
        	}
        	String x=m1()*/
        	/*Iterator iterator()
        	 {
        	 -----
        	 }
        	 Iterator it =it.itertor();
        	 
        	 */
        	//Iterator<Object>it=mylist.iterator();-heterogeneous data
		//Iterator<string>it=mylist.iterator();-homogeneous data
		
        	//checking array list is empty or not
        	System.out.println("is arraylist is empty:"+mylist.isEmpty());//false
        	
        	//Remove all the elements from array list
        	//clear method will remove all the elements
        	ArrayList mylist2=new ArrayList();
        	mylist2.add(100);
        	mylist2.add("welcome");
        	mylist.removeAll(mylist2);
        	System.out.println("After removing multiple elements:"+mylist);//[10.5, python, A, true, null, null]
        	
        	//remove all elements/clear
        	mylist.clear();
        	System.out.println(mylist);
        	System.out.println("is arraylist is empty?"+mylist.isEmpty());//true
        	
		
}
}
