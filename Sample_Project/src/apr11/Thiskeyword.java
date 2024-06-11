package apr11;

public class Thiskeyword {
	int x,y;
	Thiskeyword(int a,int b)
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
		Thiskeyword th=new Thiskeyword(100,333);
		th.display();
		

	}

}
