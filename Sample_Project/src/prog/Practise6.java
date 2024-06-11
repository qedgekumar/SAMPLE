package prog;

public class Practise6 {

	public static void main(String[] args) {
	//swapping numbers
		int a=10,b=20;
		System.out.println("Before swapping numbers are:"+a+" "+b);
		/*int t=a;
		a=b;
		b=t;*/
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		/*a=a*b;
		b=a/b;
		a=a/b;*/
		/*a=a^b;
		b=a^b;
		a=a^b;*/
		b=a+b-(a=b);
		
		
		System.out.println("After swapping numbers are:"+a+" "+b);

	}

}
