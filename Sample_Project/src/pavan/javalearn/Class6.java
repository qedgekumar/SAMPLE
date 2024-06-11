package pavan.javalearn;

public class Class6 {

	public static void main(String[] args) {
		//store integer values into array
		int x[] = new int[5];
		    x[0]=100;
		    x[1]=200;
		    x[2]=300;
		    x[3]=500;
		    x[4]=700;
		    //print length of the array
		    System.out.println(x.length);
		    //print 3 position from collection
		    System.out.println(x[3]);
		    for (int each : x) {
		    	System.out.println(each);
				
			}

	}

}
