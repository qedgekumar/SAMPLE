package apr11;

public class Statickey {
	static int a=10;
	int b=20;
	static void m1()
	{
		System.out.println("This is static method.....");
	}
	void m2()
	{
		System.out.println("This is Non static method.....");
	}
	
	

	public static void main(String[] args) {
		System.out.println(Statickey.a);
		Statickey.m1();
		Statickey k=new Statickey();
		k.m2();
		System.out.println(k.b);
		

	}

}
