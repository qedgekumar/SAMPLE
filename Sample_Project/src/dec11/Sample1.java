package dec11;

public class Sample1 {
	
	public static void addition(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
	public static String verify_String(String str1,String str2) {
		String res="  "; 
		if (str1.equalsIgnoreCase(str2)) {
			res= "Strings are equal";
			
		} else {
			res=" Strings are not equal";
			

		}
		
		return res;
	}
	public static boolean  compare_values(int x,int y) {
		if (x==y) {
			return true;
			
		}
		else {
			return false;
			
		}
		
	}

	public static void main(String[] args) {
		Sample1.addition(3456, 9876);
		String res =Sample1.verify_String("pavan", "pavan");
		System.out.println(res);
		boolean x= Sample1.compare_values(234, 234);
		System.out.println(x);
		

	}

}
