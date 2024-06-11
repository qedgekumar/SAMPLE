package may23;

public class Practise8 {

	public static void main(String[] args) {
		//sum of elements in array
	/*	int a[]= {6,8,9,3,4};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements"+sum);*/
	/*	int a[]= {2,3,4,5,6,7,8};
		int sum=0;
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("sum of elements"+sum);*/
		//even and odd numbers in array
		/*int a[]= {1,2,3,4,5,6};
		System.out.println("Even numbers in array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
			System.out.println("odd numbers are");
			for(int i=0;i<a.length;i++)
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}*/
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("Even numbers are.....");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
				
		}
		System.out.println("Odd numbers are.....");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		

		}

	}
