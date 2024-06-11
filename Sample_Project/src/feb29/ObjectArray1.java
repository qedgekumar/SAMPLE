package feb29;

public class ObjectArray1 {

	public static void main(String[] args) {
		Object x[]=new Object[4];
		x[0]="kumar";
		x[1]=233;
		x[2]='k';
		x[3]=333.98;
		System.out.println(x.length);
		System.out.println(x[2]);
		for(Object each:x)
		{
			System.out.println(each);
		}

	}

}
