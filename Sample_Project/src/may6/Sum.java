package may6;

public class Sum {

	public static void main(String[] args) {
		//sum of even numbers between 40 to 80
		int sum=0;
		for(int i=40;i<=80;i++)
		{
			if(i%2==0)
			{
				sum+=i;
				System.out.println(sum);
			}
		}

	}

}
