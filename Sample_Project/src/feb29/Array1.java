package feb29;

public class Array1 {

	public static void main(String[] args) {
		int x[]=new int[4];
		x[0]=234;
		x[1]=333;
		x[2]=444;
		x[3]=321;
		System.out.println(x.length);
		System.out.println(x[1]);
		for(int each:x)
		{
			System.out.println(each);
		}

	}

}
