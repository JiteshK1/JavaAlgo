package ArrayPrac;

public class Rotation {
    public static void main(String[] args) {
int[][] arr={{0,1},{1,0}};
int[][] target={{1,0},{0,1}};
        System.out.println(findRotation(arr,target));
    }

    public static   boolean findRotation(int[][] mat,int[][] target){
        for (int i = 0; i < 4; i++) {
            if (check(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;


    }

    private static boolean check(int[][] arr, int[][] target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]!=target[row][col]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void rotate(int[][] arr){
        int R= arr.length;
        int C = arr[0].length;
        for (int i = 0; i < R; i++) {
            for (int j = i; j <C ; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]= temp;
            }
        }
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end]=temp;
            }
            start++;
            end--;
        }
    }
    // key points : m = number of rows, n = number of cols
// rotate 90 deg once ->   i, j <--> j,  m - i - 1
// rotate 90 deg twice ->  i, j <--> m - i - 1, n - j - 1
// rotate 90 deg thrice -> i, j <--> n - j - 1, i
    public boolean FindRotation2(int[][] mat, int[][] target) {

        int m = mat.length;
        int n = mat[0].length;

        boolean one = true, two = true, three = true, four = true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //rotate one time
                if (mat[i][j] != target[j][n-i-1]) {
                    one = false;
                }
                //rotate two times
                if (mat[i][j] != target[m-i-1][n-j-1]) {
                    two = false;
                }
                //roate three times
                if (mat[i][j] != target[n-j-1][i]) {
                    three = false;
                }
                //roate four times
                if (mat[i][j] != target[i][j]) {
                    four = false;
                }
            }
        }

        return one || two || three || four;
    }

}
