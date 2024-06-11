package apr11;

public class Account {
	private int accno;
	private String name;
	private double amount;
	void setAccno(int accno)
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
	String getname()
	{
		return name;
		
	}
	void setamount(double amount)
	{
		this.amount=amount;
	}
	double getamount()
	{
		return amount;
	}

	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccno(101);
		System.out.println(acc.getAccno());
		acc.setname("pavan");
		System.out.println(acc.getname());
		acc.setamount(5555.9);
		System.out.println(acc.getamount());
		

	}

}
