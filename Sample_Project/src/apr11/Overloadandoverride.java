package apr11;
class vivo
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}
class station extends Bank
{
	void m1(int a)//overriding
	{
		System.out.println(a*a);
	}
	void m2(int b,int c)
	{
		System.out.println(b+c);
	}
}

public class Overloadandoverride {

	public static void main(String[] args) {
		vivo v=new vivo();
		v.m1(44);
		v.m2(44);
		
		
		
		

	}

}
