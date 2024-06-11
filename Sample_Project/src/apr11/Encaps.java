package apr11;

public class Encaps {
	int accno;
	String name;
	double amount;
	void setaccno(int accno)
	{
		this.accno=accno;
	}
	int getAccno()
	{
		
		return accno;
	}
	void setname(String name)
	{
		this.name=name;
		
	}
	String getName()
	{
		return name;
		
	}
	void setamount(double amount)
	{
		this.amount=amount;
	}
	double getAmount()
	{
		return amount;
		
	}

	public static void main(String[] args) {
		Encaps ac=new Encaps();
		ac.setaccno(77);
		System.out.println(ac.getAccno());
		
		ac.setname("kumar");
		System.out.println(ac.getName());
		ac.setamount(8899.9);
		System.out.println(ac.getAmount());
		

	}

}
