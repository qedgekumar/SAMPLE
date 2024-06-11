package mar3;

public class Factorial {

	public static void main(String[] args) {
		int num=8;
		long factorial=1;
		/*for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
			
		}
		System.out.println("Factorial of a number"+factorial);*/
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of a number"+factorial);
	}

}
