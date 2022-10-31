import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
 int[][] arr = {{1,2,3},
         {4,5,6},
         {7,8,9}};
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
    public static  int[][] transpose(int[][] matrix){
     int R = matrix.length;
     int C = matrix[0].length;
     int[][] output = new int[C][R];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                output[r][c]= matrix[c][r];
            }
        }
        return output;
    }
}
