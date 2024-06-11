package feb29;

public class Array {

	public static void main(String[] args) {
		int x[]=new int[5];
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		System.out.println(x.length);
		System.out.println(x[2]);
		for(int each:x)
		{
			System.out.println(each);
		}

	}

}
