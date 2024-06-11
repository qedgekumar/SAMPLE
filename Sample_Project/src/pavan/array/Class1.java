package pavan.array;

public class Class1 {

	public static void main(String[] args) {
		// store integer values into array
		int x[] = new int[10];
		    x[0] = 100;
		    x[1]= 300;
		    x[2]=500;
		    x[3]=700;
		    x[4]=900;
		    x[5]=1000;
		    x[6]=450;
		    x[7]=800;
		    x[8]=900;
		    x[9]=250;
		    //print length of the array
		    System.out.println(x.length);
		    //print 5 position from collection
		    System.out.println(x[5]);
		    for (int each : x) {
		    	System.out.println(each);
				
			}

	}

}
