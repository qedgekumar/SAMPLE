package apr11;

public class Statickeyword {
	static int a=10;
	int b=20;
	static void m1()
	{
		System.out.println("this is m1 staticmethod.....");
	}
	void m2()
	{
		System.out.println("this is m2 non-static method");
	}

	public static void main(String[] args) {
		//System.out.println(a);
		//m1();
		Statickeyword sd=new Statickeyword();
		System.out.println(sd.b);
		sd.m2();
		System.out.println(Statickeyword.a);
        Statickeyword.m1();		
		

	}

}
