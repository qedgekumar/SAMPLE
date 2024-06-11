package march18;

import java.util.Arrays;

public class Anagram2 {
	public static boolean Anagram(String s1,String s2)
	{
		String str1=s1.replaceAll("\\s", "");
		String str2=s2.replaceAll("\\s", "");
		
		if(s1.length()!=s2.length())
		{
			
		
		return false;
		}else
		{
			char c1[]=str1.toCharArray();
			char c2[]=str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			 return Arrays.equals(c1, c2);
			
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println(Anagram("care", "race"));

	}

}
