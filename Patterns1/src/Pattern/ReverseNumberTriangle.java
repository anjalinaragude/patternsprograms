package Pattern;

public class ReverseNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int rows=5;
 reverseNumberTringle( rows);
	}
public static void reverseNumberTringle(int rows)
{
	for(int i=rows;i>=1 ;i--)
	{
		for(int j=rows ;j>i;j--)
		{
			System.out.print(" ");
			
		}
		for(int k=1;k <=i;k++)
		{
			System.out.print( k+ " ");
		}
		System.out.println();
	}
}
}
