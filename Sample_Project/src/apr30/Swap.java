package apr30;

public class Swap {

	public static void main(String[] args) {
	int num=9993363;
	int count=0;
	while(num>0)
	{
		num=num/10;
		count++;
	}
	System.out.println("No of digits in a num"+count);
	}

}
