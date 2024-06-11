package may22;

public class Practise9 {

	public static void main(String[] args) {
		//count even and odd digits
		int num=1234567;
		int i;
		int even_count=0;
		int odd_count=0;
		while(num>0)
		{
			i=num%10;
			if(i%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("no of even digits"+even_count);
		System.out.println("no of odd digits"+odd_count);

	}

}
