package mar2;

public class Countdigits {

	public static void main(String[] args) {
		int num=123456;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println(count);

	}

}
