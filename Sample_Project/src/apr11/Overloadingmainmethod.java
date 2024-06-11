package apr11;

public class Overloadingmainmethod {
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
		Overloadingmainmethod ov=new Overloadingmainmethod();
		ov.main(999);
		ov.main("pavan");
		ov.main("pavan", "kumar");
		
		

	}

}
