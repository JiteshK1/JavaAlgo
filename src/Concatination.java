import java.util.Arrays;

public class Concatination {
    public static void main(String[] args) {
int[] arr ={1,2,3};
        System.out.println(Arrays.toString(getConcatenation2(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
    int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }
        int length = nums.length + nums2 .length;

        int[] result = new int[length];
        int posi = 0;
        for (int i = 0; i < nums.length; i++) {
            result[posi] = nums[i];
            posi++;
        }
        for (int i =0 ; i <nums2.length ; i++) {
             result[posi]= nums[i];
             posi ++;
        }
        return result;
    }
    public static int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] result = new  int[2*n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i+n]=nums[i];
        }
return result;
    }

}
