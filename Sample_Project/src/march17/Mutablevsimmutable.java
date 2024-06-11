package march17;

import java.util.Arrays;

public class Mutablevsimmutable {

	public static void main(String[] args) {
		//mutable-can change
		/*int a[]= {10,22,98,45,65,89};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//mutable-we can change
		System.out.println(Arrays.toString(a));*/
		
		String s= new String("welcome");
		System.out.println(s);//welcome
		String concatstring=s.concat("to java");
		System.out.println(s);//welcome-immutable-cannot change
		System.out.println(concatstring);
		
		
		
		
		
		
		

	}

}
