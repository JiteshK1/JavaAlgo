package ArrayPrac;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
 int[][] arr= {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(flippingImage2(arr)));
    }

    public static   int[][] flippingImage(int[][] image){
        for (int row = 0; row < image.length; row++) {
            int start = 0;
            int end = image[row].length - 1;
            while (start< end){
                int temp = image[row][start];
                image[row][start]=image[row][end];
                image[row][end]=temp;
                start++;
                end--;
            }
        }

        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                if (image[row][col] == 0){
                    image[row][col] = 1;
                }else {
                    image[row][col] = 0;
                }
            }
        }
        return image;
    }
    public static   int[][] flippingImage2(int[][] image){
        int r = image.length;
        int c = image[0].length;
        
        int[][] ans = new int[r][c];
        for (int i = 0; i <r; i++) {
          ans[i]=reverse(image[i]);
        }
        return ans;
    }

    private static int[] reverse(int[] col) {
        int n =col.length;
        int[] ans = new int[n];
        for (int i = 0; i < n ; i++) {
            ans[i]= col[n -i - 1]==0 ? 1:0;

        }
        return ans;
    }
}
