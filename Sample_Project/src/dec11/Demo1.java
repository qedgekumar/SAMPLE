package dec11;

public class Demo1 {
	//static global variables
	static int a,b,c;
	static double x,y,z;
	public static void addition() {
		a=3456;
		b=2345;
		c=a+b;
		System.out.println(c);
		
	}
	public static void subtraction() {
		a=7890;
		b=3456;
		c=a-b;
		System.out.println(c);
		
	}
	public static void division() {
		x=4567;
		y=87;
		z=x/y;
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		//call static method with class name
		Demo1.subtraction();
		//we can call static methods with method name
		division();
		Demo1.addition();
		

	}

}
