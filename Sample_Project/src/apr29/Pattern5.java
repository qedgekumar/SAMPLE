package apr29;

public class Pattern5 {

	public static void main(String[] args) {
		//A-Z:65-90;
		//a-z:97-122;
		int alpha=97;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha)+" ");
			}
			alpha++;
			System.out.println("");
		}

	}

}
