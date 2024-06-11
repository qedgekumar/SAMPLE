package pavan.array;

public class Class4 {

	public static void main(String[] args) {
		// store different data type into array
		Object x[]=new Object[5];
		       x[0]="hello";
		       x[1]=100;
		       x[2]='r';
		       x[3]=456.87;
		       x[4]=true;
		       System.out.println(x[2]);
		       for (Object each : x) {
		    	   System.out.println(each);
				
			}
		

	}

}
