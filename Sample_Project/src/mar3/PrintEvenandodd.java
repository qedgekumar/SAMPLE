package mar3;

public class PrintEvenandodd {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		//Extracting even numbers
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		//Extracting odd numbers
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
				
			}
		}*/
		//Extracting even numbers
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		//Extracting odd numbers
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}

	}

}
