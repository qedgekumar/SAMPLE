package prog;

public class Practise {

	public static void main(String[] args) {
		// Reverse a string
		String s="welcome";
		String rev="";
	/*	for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string is"+rev);*/
	/*	char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println("Reverse string is:"+rev);*/
		StringBuffer sb=new StringBuffer(s);
		//StringBuffer sb1=sb.append(s);
		System.out.println("Reverse string is:"+sb.reverse());
		StringBuilder sbl=new StringBuilder(s);
		System.out.println("Reverse string is:"+sbl.reverse());

	}

}
