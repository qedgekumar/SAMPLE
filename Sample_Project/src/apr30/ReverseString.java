package apr30;

public class ReverseString {

	public static void main(String[] args) {
		/*String str="welcome";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reverse string is:"+rev);*/
		
	/*	String str="pavan";
		String rev="";
		char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
			
		}
		System.out.println("Reverse string is"+rev);*/
		
		String str="pavankumar";
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println("Reverse string is"+sb.reverse());
		

	}

}
