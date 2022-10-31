public class DiagonalArray {
    public static void main(String[] args) {

    }

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int row = 0; row < n; row++) {
            sum += mat[row][row] + mat[row][n - row - 1];
        }
        if (sum % 2 == 1) sum -= mat[n / 2][n / 2];
        return sum;
    }

}
