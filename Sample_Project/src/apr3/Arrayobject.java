package apr3;

public class Arrayobject {

	public static void main(String[] args) {
		//Object a[]= {100,"pavan",'A',true,10.5,};
		/*Object a[]=new Object[5];
		a[0]=100;
		a[1]="welcome";
		a[2]='A';
		a[3]=10.5;
		a[4]=true;*/
	
		/*for(Object each:a)
		{
			System.out.println(each);
		}*/
		/*for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}*/
		Object a[]= {10,"pavan",'A',10.5,true};
		/*for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}*/
		for(Object x:a)
		{
			System.out.println(x);
		}
		
		

	}

}
