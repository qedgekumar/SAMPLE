package apr11;

public class Methodoverloading {
	int a=10,b=20;
	void sum()
	{
		System.out.println(a+b);
		
	}
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	void sum(double x,int y)
	{
		System.out.println(x+y);
	}
	void sum(int x,double y)
	{
		System.out.println(x+y);
	}
	void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		Methodoverloading addobj=new Methodoverloading();
		addobj.sum();
		addobj.sum(10.5, 333);
		addobj.sum(100, 33.4);
		addobj.sum(222, 444);
		addobj.sum(222, 333, 333);

	}

}
