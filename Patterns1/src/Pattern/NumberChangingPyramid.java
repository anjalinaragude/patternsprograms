package Pattern;

public class NumberChangingPyramid {

	public void numberChangingPyramid(int n) {
		int number = 1; 

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=4;
NumberChangingPyramid  np=new NumberChangingPyramid ();
np.numberChangingPyramid(rows);
	}

}
