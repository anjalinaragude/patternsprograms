package Pattern;

public class ZeroOneTriangle {

	public void zeroOneTriangle(int n) {
		for (int i = 0; i < n; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print((j + i) % 2 == 0 ? "1 " : "0 ");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		
		int rows=5;
		ZeroOneTriangle zo=new ZeroOneTriangle();
		zo.zeroOneTriangle(rows);
	}

}
