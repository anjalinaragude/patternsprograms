package Pattern;

public class NumberTriangle {
	static void numberTriangle(int n)
	{
		 for (int i = 1; i <= n; i++) {
	            
	            for (int j = 0; j < n - i; j++) {
	                System.out.print(" ");
	            }

	            
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=4;
numberTriangle(rows);
	}

}
