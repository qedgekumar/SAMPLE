package feb26;

public class RevStr {

	public static void main(String[] args) {
		String str="Qedgepavan";
		String rst="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rst=rst+str.charAt(i);
		}
		System.out.println(rst);

	}

}
