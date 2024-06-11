package dec11;

public class Demo3 {
	int a,b,c;
	double x,y,z;
	public void addition() {
		a=9876;
		b=2345;
		c=a+b;
		System.out.println(c);
		
	}
	public void subtraction() {
		a=3456;
		b=2345;
		c=a-b;
		System.out.println(c);
		
	}
	public void division() {
		x=780;
		y=10;
		z=x/y;
		System.out.println(z);
		
	}
	

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		obj.addition();
		obj.subtraction();
		obj.division();

	}

}
