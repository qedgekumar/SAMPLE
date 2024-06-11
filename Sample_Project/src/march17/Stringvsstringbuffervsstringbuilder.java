package march17;

public class Stringvsstringbuffervsstringbuilder {

	public static void main(String[] args) {
		//String- immutable
		/*String s="welcome";
		s.concat("to java");
		System.out.println(s);//welcome//immutable,can not change the original value of */
		
      //stringbuffer-mutuable
		/*StringBuffer s=new StringBuffer("welcome");
		s.append("to java");
		System.out.println(s);//welcometo java//mutable,we an change the original value*/
		
		//Stringbuilder-mutuable
		/*StringBuilder s=new StringBuilder("welcome");
		s.append("to java");
		System.out.println(s);//welcometo java //mutuable,we can change the original value*/
		
	}

}
