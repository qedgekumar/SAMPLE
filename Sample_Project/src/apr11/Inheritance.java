package apr11;
class A
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
	
}
class B extends A
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}
class c extends B
{
	int c=300;
	void read()
	{
		System.out.println(c);
	}
	
	
}

public class Inheritance {
	
	public static void main(String[] args) {
		c bobj=new c();
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		System.out.println(bobj.c);
		bobj.display();
		bobj.show();
		bobj.read();
		
		
		
		
		

	}

}
