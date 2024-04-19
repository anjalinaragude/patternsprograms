package Pattern;

public class ReversionLeftHalfPyramind {

	public static void reverseLeftHalfPyrami(int n){
		for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int rows=5;
 reverseLeftHalfPyrami(rows);
	}

}
