package dec11;

public class Demo2 {
	 static int a,b,c;
	static double x,y,z;
	public static void addition() {
		a=2345;
		b=2348;
		c=a+b;
		System.out.println(c);
		
		
	}
	public static void subtraction() {
		a=3456;
		b=987;
		c=a-b;
		System.out.println(c);
		
	}
	public static void division() {
		x=2000;
		y=20;
		z=x/y;
		System.out.println(z);
		
		
	}

	public static void main(String[] args) {
		Demo2.addition();
		subtraction();
		division();
		

	}

}
