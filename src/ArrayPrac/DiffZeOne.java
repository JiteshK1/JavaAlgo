package ArrayPrac;

import java.util.Arrays;

public class DiffZeOne {
    public static void main(String[] args) {
        int[][] gird={
                {0,1,1},
                {1,0,1},
                {0,0,1}

        };
        int[][] diff=onesMinusZeros(gird);

        System.out.println(Arrays.deepToString(diff));
    }
    public static int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;

        int m = grid[0].length;
        int[] row =new int[n];
        int[] col=new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                row[i]+=grid[i][j]==1?1:0;
                col[j]+=grid[i][j]==1?1:0;
            }
        }

        int[][] diff=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                diff[i][j]=row[i]+ col[j] -(m-row[i]) - (n-col[j]);
            }
        }

        return diff;
    }
}
