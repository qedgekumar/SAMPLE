package apr11;

public class Mainmetodoverload {
	void main(int x)
	{
		System.out.println(x);
	}
	void main(String s)
	{
		System.out.println(s);
	}
	void main(String s1,String s2)
	{
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		Mainmetodoverload ov=new Mainmetodoverload();
		ov.main(99999);
		ov.main("krishna");
		ov.main("pavan", "kumar");
		
		
		

	}

}
