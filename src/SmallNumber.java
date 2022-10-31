import java.util.Arrays;

public class SmallNumber {
    public static void main(String[] args) {
    int[] arr = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent2(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
int [] output = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            int count = 0;
            for (int j = 0; j < nums.length ; j++) {
               if (nums[i]!=nums[j] && nums[j]< nums[i]){
                   count++;
                   output[i] = count;
               }
            }
        }
        return output;
    }
    public static int[] smallerNumbersThanCurrent2(int[] nums) {
     int n = nums.length;
     int[] arr = Arrays.copyOf(nums,n);
     Arrays.sort(arr);
     int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            int val = nums[i];
            for (int j = 0; j < n; j++) {
                  if(val > arr[j]){
                      count ++;
                  }
            }
            ans[i] = count;
        }
return ans;
        }
}
