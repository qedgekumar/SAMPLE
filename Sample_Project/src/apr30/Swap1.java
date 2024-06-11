package apr30;

public class Swap1 {

	public static void main(String[] args) {
		/*int a=10,b=20;
		System.out.println("Before swapping numbers are"+a+"  "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping numbers are:"+a+" "+b);*/
		//logic2
		/*int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping numbers are"+a+"  "+b);*/
		
		//logic3
		/*int a=10,b=20;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping numbers are"+a+"  "+b);*/
		//logic4
		/*int a=10,b=20;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping numbers are"+a+" "+b);*/
		
		//logic5
	int a=10,b=20;
	b=((a+b)-(a=b));
	System.out.println("After swapping numbers are"+a+"  "+b);
		

	}

}
