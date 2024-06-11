package pavan.stringfunctions;

public class Class11 {

	public static void main(String[] args) throws Throwable {
		//reverse a string using reverse function
		String str = "now i am getting job in mnc";
		for(int i=str.length()-1;i>0;i--) {
			Thread.sleep(2000);
			System.out.println(str.charAt(i));
		}

	}

}
