package may1;

public class Linear {

	public static void main(String[] args) {
		int a[]= {10,20,30,44,55,66};
		int search_ele=55;
		boolean flag=true;
		for(int i=0;i<=a.length-1;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("Element is found"+i);
				flag =true;
				break;
			}
			
			
			
			
			
		}
		if(flag==false)
		{
			System.out.println("Element is not found");
		}
		

	}

}
