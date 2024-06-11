package prog;

public class Practise2 {

	public static void main(String[] args) {
		int num=12345;
		int rev=0;
		
	/*	while(num!=0)
		{
			rev=+rev*10+num%10;
			num=num/10;
			
			
		}
		System.out.println("Reverse number is"+rev);*/
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		sb.reverse();
		System.out.println(sb);*/
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		sbl.reverse();
		System.out.println(sbl);
		

	}

}
