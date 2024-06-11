package apr11;

public class Boxes {
	double width,height,depth;
	Boxes()
	{
		depth=width=height=10;
	}
	Boxes(double w ,double d ,double h )
	{
		height=h;
		width=w;
		depth=d;
		
	}
	Boxes(double len)
	{
		width=height=depth=len;
	}
	double volume()
	{
		return (width*height*depth);
		
	}
	

	public static void main(String[] args) {
		Boxes b=new Boxes();
		System.out.println(b.volume());
		Boxes c=new Boxes(10.3,4.8,8.9);
		System.out.println(c.volume());
		Boxes d=new Boxes(22.9);
		System.out.println(d.volume());
		

	}

}
