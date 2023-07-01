package mandatoryHomeWork.week6.day3;

import org.junit.Test;

public class MatrixXMatrix {
	@Test
	public void data() {
		int[][] a  = {{2,0,0,0,0},{0,4,0,1,0},{0,0,5,0,0},{0,5,0,2,0},{4,0,0,0,2}};
		System.out.println(diagSum(a));
	}

	public boolean diagSum(int[][] mat) {
		int sum=0;
		boolean flag=false;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i!=j && i + j != mat.length - 1 && mat[i][j]!=0) {
					return false;
				}
				else if(i==j && mat[i][j]==0) {
					return false;
				}
				else if(i+j == mat.length-1 && mat[i][ mat.length -i- 1]==0) {
					return false;
				}
			}
		}
		return flag=true;
		}

	public int diagonal(int[][] mat) {
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
