package may22;

public class Practise8 {

	public static void main(String[] args) {
	int num=10034586;
	int sum=0;
	while(num>0)
	{
		sum=sum+num%10;
		num=num/10;
	}
	System.out.println("sum of digits"+sum);
	}

}
