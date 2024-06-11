package apr11;
class city
{
	double roi()
	{
		return 0;
	}
}
class hyd extends city
{
	double roi()
	{
		return 11.4;
	}
}
class banglore extends city
{
	double roi()
	{
		return 22.4;
	}
}

public class Methodoverride {

	public static void main(String[] args) {
		hyd h=new hyd();
		System.out.println(h.roi());
		banglore b=new banglore();
		System.out.println(b.roi());
		
		

	}

}
