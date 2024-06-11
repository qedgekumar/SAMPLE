package dec11;

public class Nonstaticvariables {
	//non static global variables
	int a,b,c;
	double x,y,z;
	public void addition() {
		a=45678;
		b=3456;
		c=a+b;
		System.out.println(c);
		
	}
	public void subtraction() {
		a=56789;
		b=34567;
		c=a-b;
		System.out.println(c);
		
	}
	public void division() {
		x=4567;
		y=87;
		z=x/y;
		System.out.println(z);
		
	}
	

	public static void main(String[] args) {
		//create refrence object for demo class
		Nonstaticvariables obj = new Nonstaticvariables();
		obj.addition();
		obj.subtraction();
		obj.division();
		
		

	}

}
