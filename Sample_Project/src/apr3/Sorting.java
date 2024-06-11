package apr3;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {100,300,98,33,78};
		System.out.println("Before sorting......:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting....."+Arrays.toString(a));
		String s[]= {"A","c","D","B","p","0"};
		System.out.println("Before sorting.....:"+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After sorting...."+Arrays.toString(s));
		char c[]= {'a','c','o','n','l'};
		System.out.println("Before sorting.....:"+Arrays.toString(c));
		Arrays.sort(c);
		System.out.println("After sorting...."+Arrays.toString(c));

	}

}
