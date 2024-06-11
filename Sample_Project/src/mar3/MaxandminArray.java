package mar3;

public class MaxandminArray {

	public static void main(String[] args) {
		/*int a[]= {55,67,23,98,45,99};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			
			
		}
		System.out.println("max no is"+max);*/
		int a[]= {34,45,78,90};
		int min=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min value"+min);

	}

}

