package apr11;

public class This {
	int x,y;
	This(int a,int b)
	{
		this.x=a;
		this.y=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		This th=new This(222, 999);
		th.display();
		

	}

}
