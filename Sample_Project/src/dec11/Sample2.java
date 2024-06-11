package dec11;

public class Sample2 {
	public static void division(int a,int b) {
		int c= a/b;
		System.out.println(c);
		
	}
	public static String verify_string(String str1,String str2) {
		 String res = "  ";
		 if (str1.equalsIgnoreCase(str2)) {
			 res = "Strings are equal"; 
			
		} else {
			res = "Strings are not equal";

		}
		return res;
		 
		
		
	}
	public static boolean compare_values(int a,int b) {
		if (a==b) {
			return true;
			
		} else {
			return false;

		}
		
		
	}

	public static void main(String[] args) {
		Sample2.division(456, 6);
		String res =Sample2.verify_string("jai"," jai");
		System.out.println(res);
		boolean x = Sample2.compare_values(900, 987);
		System.out.println(x);
		

	}

}
