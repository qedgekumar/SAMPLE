package apr4;

public class Stringspr {

	public static void main(String[] args) {
	/*	String s="software engineer";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string is"+rev);*/
		
	/*	String s="india is my country";
		String rev=" ";
		char a[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+a[i];
			
		}
		System.out.println("Reverse string is"+rev);*/
		
		StringBuffer sb=new StringBuffer("welcome");
		StringBuilder s=new StringBuilder("pavan");
		System.out.println(sb.reverse());
		System.out.println(s.reverse());

	}

}
