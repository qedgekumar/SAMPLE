package prog;

public class Practise9 {

	public static void main(String[] args) {
		//Palindrime string
		String s="madam";
		String rev="";
		String org_str=s;
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		if(org_str.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
