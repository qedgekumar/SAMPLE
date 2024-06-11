package may23;

public class Practise {

	public static void main(String[] args) {
		//remove junk spaces
		/*String str="@#$%^&**(())1234uuuuASSD";
		String s=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);*/
		
		//remove all junk spaces
		/*String str="123689!@*(PPPPPJFHaabbdd&*()@";
		String s=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);*/
	/*	String str="pavan   kumar  arisetti software tester";
		System.out.println("Before removing white spaces:"+str);
		String s=str.replaceAll("\\s", "");
		System.out.println("After removing white spaces:"+s);*/
	/*	String str="java pavan kumar automation python life kerst";
		int total_count=str.length();
		int countafterremove=str.replace("n", "").length();
		int count=total_count-countafterremove;
		System.out.println("no of occurences"+count);*/
		
		//Reverse each word in a string
		/*String str="welcome to java";
		String[] words=str.split(" ");
		String revstring="";
		for(String w:words)
		{
			String revword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				 revword=revword+w.charAt(i);
			}
			revstring=revstring+revword+" ";
		}
		System.out.println("reverse string:"+revstring);*/
		//Reverse word in a string
		/*String str="pavan kumar arisetti";
		String[] words=str.split(" ");
		String revstring="";
		for(String w:words)
		{
			String revword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revword=revword+w.charAt(i);
			}
			revstring=revstring+revword+" ";
			
			
		}
       System.out.println("Reverse string is:"+revstring);*/
		//Reverseword
		String str="pavan kumar arisetti selenium tester";
		String[] words=str.split("\\s");
		String revword="";
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			revword=revword+sb.toString()+" ";
			
		}
		System.out.println("revword"+revword);
		
	}

}
