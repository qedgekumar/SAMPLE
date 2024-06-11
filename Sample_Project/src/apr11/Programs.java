package apr11;

public class Programs {
	int a=10,b=20;
	void sum()//No parameters
	{
		System.out.println(a+b);
	}
	void sum(int x,int y)
	{
		System.out.println(x+y);
		}
	void sum(int x,double y)
	{
		System.out.println(x+y);
	}
	void sum(double x,int y)
	{
		System.out.println(x+y);
		
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Programs addobj=new Programs();
		addobj.sum();
		addobj.sum(100, 100);
		addobj.sum(100, 10.5);
		addobj.sum(10.5, 100);
		addobj.sum(10, 22, 88);

	}

}
