package feb29;

public class ObjectArray {

	public static void main(String[] args) {
		Object x[]=new Object[5];
		x[0]=234;
		x[1]="pavan";
		x[2]=345.98;
		x[3]='p';
		x[4]=true;
		System.out.println(x.length);
		System.out.println(x[3]);
		for(Object each:x)
		{
			System.out.println(each);
		}

	}

}
