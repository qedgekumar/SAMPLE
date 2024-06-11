package may6;

public class Practise {

	public static void main(String[] args) {
		for(int i=50;i<=150;i++)
			{
			boolean prime=true;
			if(i<=1)
			{
				prime=false;
				
			}
			else
			{
				for(int d=2;d<=i/2;d++)
				{
					if(i%d==0)
					{
						prime=false;
						break;
					}
				}
			}
			if(prime)
			{
				System.out.println(i);
			}
			
			
		}

	}

}
