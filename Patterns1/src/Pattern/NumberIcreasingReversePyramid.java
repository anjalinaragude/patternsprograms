package Pattern;

public class NumberIcreasingReversePyramid {
 public static void IncreaseReversePyramd(int rows)
 {
	 for (int i = rows; i >= 1; i--) {
         for (int j = 1; j <= i; j++) {
             System.out.print(j);
         }
         System.out.println();
     }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int rows=4;
 IncreaseReversePyramd(rows);
	}

}
