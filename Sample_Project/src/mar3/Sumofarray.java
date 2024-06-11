package mar3;

public class Sumofarray {

	public static void main(String[] args) {
		int a[]= {2,9,7,6};
		int sum=0;
		/*for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of array"+sum);*/
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("sum of array"+sum);

	}

}
