package march17;

public class Strings2 {

	public static void main(String[] args) {
		//Reverse a string
		//Approach1-length(),charAt()
		/*String s="selenium";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println("reverse string is"+ rev);*/
		
		//Approach 2-by converting string to char array type
		/*String s="pavankumar";
		String rev="";
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string"+rev);*/
		
		//Approach 3- String buffer
		
		/*StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.reverse());*/
		
		//Approach 4-String builder
		/*StringBuilder s=new StringBuilder("kumar");
		System.out.println(s.reverse());*/
		
		

	}

}
