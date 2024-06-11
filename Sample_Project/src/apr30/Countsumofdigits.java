package apr30;

public class Countsumofdigits {

	public static void main(String[] args) {
	int num=33388899;
	int sum=0;
	while(num>0)
	{
		sum=sum+num%10;
		num=num/10;
	}
	System.out.println("sum of digits is"+sum);

	}

}
