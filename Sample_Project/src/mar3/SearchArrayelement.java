package mar3;

public class SearchArrayelement {

	public static void main(String[] args) {
		int a[]= {10,20,98,44,87,99};
		int sear_ele=22;
		boolean flag=false;
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
			if(sear_ele==a[i])
			{
				System.out.println("Element found at"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element is not found");
		}

	}

}
