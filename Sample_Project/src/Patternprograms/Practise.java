package Patternprograms;

import java.util.Arrays;

public class Practise {

	public static void main(String[] args) {
		String s="welcome";
		int p=s.length();
		//System.out.println(p);
		String q=new String("welcome");
	//	System.out.println(q);
		System.out.println("welcome".length());
         String s1="welcome";
         String s2="to java";
        // System.out.println(s1+s2);
        // System.out.println(s1.concat(s2));
         String s3="automation";
         //System.out.println(s1+s2+s3);
         //System.out.println(s1.concat(s2).concat(s3));
      //   System.out.println("welcome".concat("pavan").concat("testing"));
        // System.out.println(s1.concat(s2+s3));
         //System.out.println("welcome"+"pavan"+"kumar");
         String p1="  welcome  ";
       //  System.out.println(p1.length());
      //  p1= p1.trim();
        // System.out.println(p1.trim().length());
        // System.out.println(s1.charAt(4));
       //  System.out.println(s3.contains("io"));
         //System.out.println(s3.contains("pava"));
         //System.out.println(s3.contains("aio"));
         String q1="pavan";
         String q2="pavan";
         String q3="PAVAN";
       //  System.out.println(q1==q2);
         //System.out.println(q1.equals(q2));
         //System.out.println(q1.equals(q3));
         //System.out.println(q1.equalsIgnoreCase(q3));
       String z="welcome to pavan selenium python java selenium python";
        // z=z.replace('e', 'z');
         //System.out.println(z);
     //  System.out.println(z.replace("selenium","ruby"));
       //System.out.println(z.substring(0,9));
     //  String r="abcaabc";
       //System.out.println(r.replace('a', 'x').replace('c', 'y'));
         String y="WELCOME";
        // System.out.println(y.toUpperCase());
        // System.out.println(y.toLowerCase());
         String a="pavan@gmail.com";
         System.out.println(a.substring(0,6));
        
         String[] x=a.split("@");
       //  System.out.println(x[0]);
         //System.out.println(x[1]);
        // System.out.println(Arrays.toString(x));
         String amount="$15,20,55";
    /*   System.out.println(amount.replace("$", ""));
       System.out.println(amount.replace("$","").replace(",",""));
       String t="abc,123@xyz";
       String arr1[]=t.split(",");
       System.out.println(Arrays.toString(arr1));
       String arr2[]=arr1[1].split("@");
       System.out.println(Arrays.toString(arr2));
         System.out.println(arr1[0]);
         System.out.println(arr2[0]);
         System.out.println(arr2[1]);*/
       //  String o="abc 123";
         //String arr[]=o.split(" ");
         //System.out.println(Arrays.toString(arr));
         //*%^&()-you can not use delemeters
         String name="Jhon kennedy";
        // System.out.println(name.contains("jhon"));
         //System.out.println(name.toLowerCase().contains("jhon"));
         System.out.println(name.replace('J', 'j').contains("jhon"));
	}

}
