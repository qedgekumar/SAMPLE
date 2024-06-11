package dec11;

public class Sample {
	public static void addition(int a,int b) {
		int c = a+b;
		System.out.println(c);
		
	}
	public static String verify_string(String str1,String str2) {
		String res=" ";
		if (str1.equalsIgnoreCase(str2)) {
			res="Strings are equal ";
			
		} else {
			res="Strings are not equal";

		}
		return res;
	
	}
	public static boolean  compare_values(int x,int y) {
		if (x==y) {
			return true;
			
		} else {
			return false;

		}
		
	}
	

	public static void main(String[] args) {
		Sample.addition(2345, 4567);
		String res = Sample.verify_string("hello", " hello");
		System.out.println(res);
		boolean x = Sample.compare_values(234, 879);
		System.out.println(x);
		

	}

}
