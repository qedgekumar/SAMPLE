package pavan.stringfunctions;

public class Class6 {

	public static void main(String[] args) {
		String states="andhra@karnataka@ts@tn@up@wb@";
		String str1 []=states.split("@");
				System.out.println(str1[3]);
		for (String each : str1) {
			System.out.println(each);
		}
	

	}

}
