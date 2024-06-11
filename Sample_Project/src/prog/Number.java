package prog;

public class Number {

	public static void main(String[] args) {
		int num=123456;
		//int rev=0;
	/*	while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is"+rev);*/
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer s=sb.reverse();
		System.out.println(s);*/
		StringBuilder sbl=new StringBuilder(num);
		StringBuilder rev=sbl.append(num);
		rev.reverse();
		System.out.println(rev);
		

	}

}
