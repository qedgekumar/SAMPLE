package pavan.stringfunctions;

public class Class3 {

	public static void main(String[] args) {
		String str ="welcome into very wonderful world";
		String xarray[]=str.split("very");
		System.out.println(xarray[0]);
		System.out.println(xarray[1]);
		String dob="20/07/1992";
		String str1[]=dob.split("/");
		for (String each : str1) {
		System.out.println(each);	
		}
String company="TCS@GOOGLE@TECHMAHENDRA@DELOITE@HCL@TATA@IBM";
String str4[]=company.split("@");
System.out.println(str4[6]);
for (String each : str4) {
	System.out.println(each);
}

		
		

	}

}
