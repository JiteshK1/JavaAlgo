import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
int[] arr = {1,2,3,2,2,1};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
    public static int[] removeDuplicates(int[] nums) {
      int j = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
                if (nums[i]!= nums[i+1]){
                    nums[j++]=nums[i];
                }
            }
        nums[j]= nums.length -1;

        return nums;

        }


}
