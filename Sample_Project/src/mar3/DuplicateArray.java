package mar3;

public class DuplicateArray {

	public static void main(String[] args) {
		String arr[]= {"java","c","python","sap","linux","oops","oops"};
		boolean flag=false;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate number"+arr[i]);
					flag=true;
				}
				
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate number is not found");
		}

	}

}
