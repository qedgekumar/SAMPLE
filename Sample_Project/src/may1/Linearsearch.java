package may1;

public class Linearsearch {

	public static void main(String[] args) {
		int a[]= {10,89,55,77,99};
		int search_ele=55;
		boolean flag=false;
		for(int i=0;i<=a.length-1;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("element is found"+i);
				flag=true;
				break;
				
			}
		}
		if(flag==false)
		{
			System.out.println("element is not found");
		}
		

	}

}
