package may22;

public class Practise10 {

	public static void main(String[] args) {
		int n1=0,n2=1,sum=0;
		System.out.println(n1+"  "+n2);
		for(int i=2;i<=10;i++)
		{
			sum=n1+n2;
			System.out.print(n1+" "+n2);
			n1=n2;
			n2=sum;
		}
		System.out.print("fibnaccio series:"+sum);

	}

}
