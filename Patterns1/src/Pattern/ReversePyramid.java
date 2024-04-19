package Pattern;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=5;
reversePyramid(rows);
	}
	public static void reversePyramid(int rows)
	{
		for(int i=rows;i >= 1; i--) {
			for(int j=rows; j> i ;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
