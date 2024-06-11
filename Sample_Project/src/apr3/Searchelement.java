package apr3;

public class Searchelement {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int search_element=20;
		boolean status=true;
		/*for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("elemnet found");
				status=true;
				break;
				
			}
			else
			{
				System.out.println("Element not found");
			}
		}*/
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println("element found");
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
