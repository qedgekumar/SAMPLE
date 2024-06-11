package dec11;

public class Demo {
	int a,b,c;
	double x,y,z;
	public void addition() {
		a=8908;
		b=4567;
		c=a+b;
		System.out.println(c);
		
		
	}
	public void subtraction() {
		a=45678;
		b=34567;
		c=a-b;
		System.out.println(c);
		
	}
	public void multiplication() {
		x=234;
		y=345;
		z=x*y;
		System.out.println(z);
		
		
	}
    public void division() {
    	int p,q,r;
    	p=4000;
    	q=20;
    	r=p/q;
    	System.out.println(r);
	
}
	public static void main(String[] args) {
		//create refrence object for demo class
		Demo obj = new Demo();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();
		

	}

}
