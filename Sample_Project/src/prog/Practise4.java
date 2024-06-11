package prog;

public class Practise4 {

	public static void main(String[] args) {
	/*	int num=12121;
		int rev=0;
		int org_num=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		rev=rev+num;
		if(org_num==rev)
			System.out.println("Palindrome number"+org_num);
		else
			System.out.println("Not a palindrome number:"+org_num);*/
	/*	String s="madam";
		String rev="";
		String org_str=s;
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(org_str.equals(rev))
			System.out.println("Reverse string is:"+org_str);
		else
			System.out.println("Not a Reverse string is:"+org_str);*/
	/*	String s="@#$%^1234qwwwgjtmgwtmASDFRGJH2322!@@";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
	/*	System.out.println(s);*/
	/*	String s="selenium java python  ruby ";
		String str=s.replaceAll("\\s", "");
		System.out.println(str);*/
/*	String s="pavan kumar java java selenium akash";
		int initcount=s.length();
		int ficount=s.replaceAll("a","").length();
		int count=initcount-ficount;
		System.out.println(count);*/
	/*	String s="java python ruby";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
				count++;
		}
		System.out.println(count);*/
	/*	String str="java python ruby";
		String words[]=str.split(" ");
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
		System.out.println(revstring);*/
		String str="java python ruby magic";
		String words[]=str.split("\\s");
		String revstring="";
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			revstring=revstring+sb.toString()+" ";
			
				
				
			}
		System.out.println(revstring);
		
		
		
		
		
		
		

}
}
