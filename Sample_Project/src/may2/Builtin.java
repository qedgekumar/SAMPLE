package may2;

import java.util.Arrays;
import java.util.Collections;

public class Builtin {

	public static void main(String[] args) {
		//int a[]= {66,99,55,44,22};
		Integer a[]= {77,99,33,66,88};
		System.out.println("Before sorting:"+Arrays.toString(a));
		//Arrays.parallelSort(a);
		//Arrays.sort(a);
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After sorting:"+Arrays.toString(a));

	}

}
