package may1;

public class Evenoddarray {

	public static void main(String[] args) {
		int a[]= {2,4,6,7,9,1,3,8};
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
			
			
		}
		for(int value:a)
		{
		if(value%2==0)
		{
			System.out.println(value);
		}
		}
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}

	}

}
