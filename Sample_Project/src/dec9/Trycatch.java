package dec9;

public class Trycatch {

	public static void main(String[] args) {
		//divide any number with zero
		try {
			int x=589,y=0,z;
			z=x/y;
			System.out.println(z);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
			
		}
		int a =9296,b=8,c;
		c=a/b;
		System.out.println(c);

	}

}
