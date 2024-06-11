package feb26;

public class Stringreverse {

	public static void main(String[] args) {
		String str="QedgeTechnologies";
		String rts="";
		int len_str=str.length();
		for(int i=len_str-1;i>=0;i--) {
			rts=rts+str.charAt(i);
		}
		System.out.println(rts);

	}

}
