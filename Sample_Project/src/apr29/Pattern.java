package apr29;

public class Pattern {

	public static void main(String[] args) {
		//int alpha=65;
		int alpha=97;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}

	}

}
