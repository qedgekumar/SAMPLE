package mar2;

public class Countnoofdigits {

	public static void main(String[] args) {
		int num=44338990;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println("No of digits:"+count);

	}

}
