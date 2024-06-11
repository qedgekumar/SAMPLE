package apr11;
class Bank
{
	double roi()
	{
		return 0;
		
	}
}
class  icic extends Bank
{
	double roi()
	{
		return 10.5;
		
	}
}
class sbi extends Bank
{
	double roi()
	{
		return 11.4;
		
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		icic ro=new icic();
		System.out.println(ro.roi());
		sbi ror=new sbi();
		System.out.println(ror.roi());
		

	}

}
