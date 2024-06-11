package may22;

public class Practise {

	public static void main(String[] args) {
		int a=20,b=40;
	/*	System.out.println("Before swapping values are:"+a+"  "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping values are:"+a+" "+b);*/
		//logic 2-without using third variable
	/*	a=a+b;//20+40=60
		b=a-b;//60-40=20
		a=a-b;//60-20=40;
		System.out.println("after swapping"+a+"  "+b);*/
		//loic3-
		/*a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("values"+a+" "+b);*/
		//logic 4
		/*a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("swapping"+a+"  "+b);*/
		b=a+b-(a=b);
		System.out.println("swapping"+a+"  "+b);
		

	}

}
