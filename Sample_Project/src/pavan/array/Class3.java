package pavan.array;

public class Class3 {

	public static void main(String[] args) {
		// store string type data into array collection
		String months[]= {"jan","feb","march","apr","may","june","july","aug","sep","oct","nov","dec"};
		//print length of the months 
		System.out.println(months.length);
		//print 5 position of month from collection
		System.out.println(months[5]);
		for (String each : months) {
			System.out.println(each);
			
		}
		
		

	}

}
