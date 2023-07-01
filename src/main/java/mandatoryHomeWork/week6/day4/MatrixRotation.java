package mandatoryHomeWork.week6.day4;

import org.junit.Test;

public class MatrixRotation {
	@Test
	public void data() {
		int[][] a  = {{0,0,0},{0,1,0},{1,1,1}};
		int[][] b  = {{1,1,1},{0,1,0},{0,0,0}};
		System.out.println(rotation(a,b));
	}

	public boolean rotation(int[][] mat, int[][] target) {

		int n = mat.length;
        int r90 = 0, r180 = 0 , r270 = 0 , r0 = 0;

        for(int i = 0; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                
                if(target[i][j] == mat[n-1-j][i]) r90++;
                System.out.print(mat[n-1-i][n-1-j]);
                if(target[i][j] == mat[n-1-i][n-1-j]) r180++;
                if(target[i][j] == mat[j][n-1-i]) r270++;
                if(target[i][j] == mat[i][j]) r0++;
            }
        }

        if(r90==n*n || r180==n*n || r270==n*n || r0==n*n){
            return true;
        }
        else{
            return false;
        }
        
    }
}
