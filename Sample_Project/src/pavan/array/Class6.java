package pavan.array;

public class Class6 {

	public static void main(String[] args) {
		// store different datatype into array
		Object x[]=new Object [6];
		       x[0]=100;
		       x[1]="pavan";
		       x[2]=false;
		       x[3]='t';
		       x[4]=345.89;
		       x[5]=34;
		 System.out.println(x.length);
		 System.out.println(x[4]);
		 for (Object each: x) {
			 System.out.println(each);
			
		}
		 

	}

}
