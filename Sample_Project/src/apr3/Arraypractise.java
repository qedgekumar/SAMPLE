package apr3;

public class Arraypractise {

	public static void main(String[] args) {
		//searching an element in array
		int a[]= {10,20,30,40,50,60};
		int search_element=40;
		boolean status=false;
		/*for(int i=0;i<=a.length-1;i++)
		{
			//System.out.println(a[i]);
			if(a[i]==search_element)
			{
				System.out.println("Element found");
				//status=true;
			}
			else
			{
				System.out.println("Element is not found");
			}
		}*/
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
			else
			{
				System.out.println("Element is not found");
			}
		}
		
		
		

	}

}
