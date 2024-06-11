package apr4;

public class Stringpr {

	public static void main(String[] args) {
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("welcome");
		String s4=new String("welcome");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String s5="abc";
		String s6=new String("abc");
		String s7=s6;
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s6==s7);
		System.out.println(s6.equals(s7));
		System.out.println(s5==s7);
		
		
		

	}

}
