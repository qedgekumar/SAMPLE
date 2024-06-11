package prog;

public class Practise8 {

	public static void main(String[] args) {
		//Reverse string
		String s="pavankumar";
		String rev="";
	/*	for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string is"+rev);*/
	/*	StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);*/
		char c[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
		

	}

}
