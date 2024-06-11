package may1;

public class Maxandmin {

	public static void main(String[] args) {
		int a[]= {55,10,35,56,89,99};
		int min=a[2];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				System.out.println("min no is"+a[i]);
			}
		}

	}

}
