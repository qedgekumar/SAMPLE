package feb26;

public class Reversestring {



	public static void main(String[] args) {

		String str="pavan";
		String rst="";
		int len_str=str.length();
		for(int i=len_str-1;i>=0;i--)
		{
			rst=rst+str.charAt(i);
		}
		System.out.println(rst);

		


	}
}

