package Pattern;

public class Numbertringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		numberTringle( rows);

	}
	public static void numberTringle( int rows)
	{
		for(int i=1;i<=rows ;i++)
		{
			for(int j=rows ;j>i;j--)
			{
				System.out.print("  ");
				
			}
			for(int k=1;k <=i;k++)
			{
				System.out.print( k+ " ");
			}
			System.out.println();
		}
	}

}
