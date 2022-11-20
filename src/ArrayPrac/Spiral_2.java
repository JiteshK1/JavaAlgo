package ArrayPrac;

import java.util.Arrays;

public class Spiral_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
    public static int[][] generateMatrix(int n){
        int[][] ans= new int[n][n];
        int rowBegin=0;
        int rowEnd=n-1;
        int colBegin=0;
        int colEnd=n-1;
        int  counter = 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd){
            for (int i = colBegin; i <=colEnd ; i++) {
            ans[rowBegin][i] = counter++;
            }
            rowBegin++;
            for (int i = rowBegin; i <=rowEnd ; i++) {
                ans[i][colEnd]=counter++;
            }
            colEnd--;

            if (rowBegin<=rowEnd){
                for (int i = colEnd; i >=colBegin ; i--) {
                    ans[rowEnd][i]=counter++;
                }
            }
            rowEnd--;
            if (colBegin<=colEnd){
                for (int i = rowEnd; i >=rowBegin ; i--) {
                    ans[i][colBegin]=counter++;
                }
            }
            colBegin++;

        }
        return ans;

    }
}
