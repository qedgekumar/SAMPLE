package dec9;

public class Trycatch1 {

	public static void main(String[] args) {
		//divide any  number with zero
		try {
			int x=234,y=0,z;
			z=x/y;
			System.out.println(z);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		int a=2400,b=30,c;
		c=a/b;
		System.out.println(c);

	}

}
