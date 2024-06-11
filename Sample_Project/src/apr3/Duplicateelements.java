package apr3;

public class Duplicateelements {

	public static void main(String[] args) {
		int a[]= {100,300,200,222,800,100,100};
		int num=100;
		int count=0;
	/*	for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==num)
			{
				count++;
			}
			System.out.println(count);
		}*/
		for(int value:a)
		{
			if(value==num)
			{
				count++;
				
			}
			System.out.println(count);
		}

	}

}
