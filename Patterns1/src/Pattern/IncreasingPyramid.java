package Pattern;

public class IncreasingPyramid {

	
	    public static void main(String[] args) {
	        int rows = 5;
int i=1;
	        for (i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	                
	            }
	            
	            System.out.println();
	        }
	    }
	}
