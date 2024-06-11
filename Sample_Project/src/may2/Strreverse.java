package may2;

public class Strreverse {

	public static void main(String[] args) {
		/*String str="java python car bus larry ";
		String[] words=str.split(" ");
		String reversestring="";
		
		for(String w:words)
		{
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			reversestring=reverseword+reversestring+" ";
		}
		System.out.println(reversestring);*/
		String str="java python ruby pavan";
		String[] words=str.split("\\s");
		String reverseword="";
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseword=reverseword+sb.toString()+"";
			
			
		}
		System.out.println(reverseword);
		

	}

}
