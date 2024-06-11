package apr3;

public class Array {

	public static void main(String[] args) {
		/*int a[]=new int[8];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		a[5]=600;
		a[6]=700;
		a[7]=800;
		System.out.println("length of an array:"+a.length);
		System.out.println(a[2]);*/
	/*	for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		/*for(int each:a)
		{
			System.out.println(each);
		}*/
		int a[][]=new int[4][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		a[3][0]=700;
		a[3][1]=800;
		//a[][]={{100,200},{300,400},{500,600},{700,800}};
		System.out.println("length of rows:"+a.length);
		System.out.println("length of columns:"+a[0].length);
		System.out.println(a[2][0]);
		/*for(int r=0;r<=3;r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.println(a[r][c]+" ");
			}
			System.out.println();
			
		}*/
		/*for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				System.out.println(a[r][c]+"  ");
			}
			System.out.println();
		}*/
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.println(y+" ");
			}
			System.out.println();
		}
		         

	}

}
