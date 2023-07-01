package mandatoryHomeWork.week6.day2;

import org.junit.Test;

public class DiagonalMatrix {
	@Test
	public void data() {
		int[][] a  = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(diagSum(a));
	}

	public int diagSum(int[][] mat) {
		int sum=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i==j) {
					sum += mat[i][j];
				}
				else if (i + j == mat.length - 1) {
		            sum += mat[i][j];
		        }
			}
		}
		return sum;
        
    }

	public int diagSum1(int[][] mat) {
		int sum=0;
		for (int i = 0; i < mat.length; i++) {
					sum += mat[i][i];
				if (i  != mat.length -i- 1) {
		            sum += mat[i][ mat.length -i- 1];
		        }
			
		}
		return sum;
        
    }
}
