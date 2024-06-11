package apr4;

public class Stringspractise {

	public static void main(String[] args) {
		//Reverse a string
		/*String s="pavan kumar";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);*/
		
		/*String s="automation tester";
		String rev=" ";
		char a[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);*/
		
		String s="welcome";
		String k=new String("welcome");
		StringBuffer sb=new StringBuffer("welcome");
		StringBuilder sbb=new StringBuilder("welcome");
		System.out.println(sb.reverse());
		System.out.println(sbb.reverse());

	}

}
