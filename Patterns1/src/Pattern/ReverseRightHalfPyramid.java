package Pattern;

public class ReverseRightHalfPyramid {
	public static void reverseRightHalfPyramid(int n)
	{
		for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
          
            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		
int rows=5;
reverseRightHalfPyramid(rows);
	}

}
