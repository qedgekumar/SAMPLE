package march17;

import java.util.Arrays;

public class Strings1 {

	public static void main(String[] args) {
		String s ="welcome"; 
		//System.out.println(s.length());
		String s1=new String("welcome");
         //System.out.println(s1);
		//length()-returns length of a string(number of characters)
		s.length();
		System.out.println(s.length());
		System.out.println("welcome".length());
		
		//concat()-joining strings 
		String s2="welcome";
		String s3="to java";
		String s4="automation";
		System.out.println(s2+s3);//welcomrto java
		System.out.println(s2.concat(s3));//welcometo java
		System.out.println(s2+s3+s4);
		System.out.println(s2.concat(s3).concat(s4));
		System.out.println(s2.concat(s3+s4));
		System.out.println("welcome"+"to java");
		System.out.println("welcome".concat("to java"));
		
		//trim()-remove spaces right and left side
		 String s5="  welcome  ";
		 System.out.println(s5);
		 System.out.println("Before trimming"+s5.length());//print string along with spaces
		 System.out.println(s5.trim());
		 
		 //charAt()-returns a character from a string based on index
		String s6="welcome";
		System.out.println(s.charAt(3));
		 System.out.println("After trimming"+s.trim().length());
		 System.out.println(s6.charAt(0));
		 
		 //contains()-returns true/false
		 //checks string is part of the main string or not
		 s="welcome";
		 System.out.println(s.contains("wel"));//true
		 System.out.println(s.contains("come"));//true
		 System.out.println(s.contains("We"));//flase
		 System.out.println(s.contains("COME"));//false
		 System.out.println(s.contains("welme"));//false bcoz sequence is not exactly matching
		 
		 //equals(),equalsIgnorecase() - compare strings
		 s1="welcome";
		 s2="welcome";
		 
		 System.out.println(s1==s2);//true
		 
		 System.out.println(s1.equals(s2));//true
		 System.out.println(s1.equals("Welcome"));//false
		 System.out.println(s1.equalsIgnoreCase("WElcome"));//true
		 
		 //replace()-replace single/multiple (sequence)of characters in a string
		 s="welcome to delenium java python ruby";
		 System.out.println(s.replace('e', 'z'));
		 System.out.println(s.replace("python", "sql"));
		 
		 //substring() - extract substring from the main string
		 //s.substring(starating idex,last index)
		 //starating index count from zero,ending index count from one
		 s="selenium";
		 System.out.println(s.substring(1,5));//elen
		 System.out.println(s.substring(0,3));//sel
		 //touppercase(), tolowercase()
		 s="AutoMationN";
		 System.out.println(s.toUpperCase());
		 System.out.println(s.toLowerCase());
		 
		 //split() - split the string into multiple parts based on delimeter
		 //delimeter-@,., space
		 s="abc@gmail.com";
		 System.out.println(s.substring(0,3));//abc
		 System.out.println(s.split("@"));
		String a[]= s.split("@");
		System.out.println(a[0]);//abc
		System.out.println(a[1]);//@gmail.com
		//split method will return array
		System.out.println(Arrays.toString(a));
		 
		//ex1
		String amount="$15,34,44";//exp 153444
		System.out.println(amount.replace("$", ""));//15,34,44-single quoations empty values not allowed
		System.out.println(amount.replace("$", "").replace(",", ""));//153444
		
		//ex2
		s="abc,123@xyz";//abc 123 xyz
		System.out.println(s.split(","));
		String b[]=s.split(",");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(Arrays.toString(b));
		String b2[]=b[1].split("@");
		System.out.println(Arrays.toString(b2));
		System.out.println(b[0]);
		System.out.println(b2[0]);
		System.out.println(b2[1]);
		
		//ex3
		s="abc 123 zyz";
		String c[]=s.split(" ");
		System.out.println(Arrays.toString(c));
		
		//* % ^ & ( ) -you cannot use delimeters
		
		 
		//ex4
		String name="Pavan kumar";
		System.out.println(name.contains("pavan"));//false bcoz of p capital letter
		System.out.println(name.replace('P', 'p').contains("pavan"));
		System.out.println(name.toLowerCase().contains("pavan"));
		 
		 
		
	}

}
