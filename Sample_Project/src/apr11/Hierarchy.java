package apr11;
class parent
{
	int a=100;
	int b=200;
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
class child1 extends parent
{
	int c=555;
	void m2()
	{
		System.out.println(c);
		
	}
}
class child2 extends parent
{
	int d=444;
	void m3()
	{
		System.out.println(d);
	}
}

public class Hierarchy {

	public static void main(String[] args) {
		child1 c1 =new child1();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		c1.m1();
		c1.m2();
		child2 c2=new child2();
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c2.d);
		c2.m1();
		c2.m3();
		
		

	}

}
