package ArrayPrac;

import java.util.Arrays;

public class MaxProductDifference {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int min1 = nums[0];
        int min2 = nums[1];
        int max1 = nums[nums.length - 1];
        int max2 = nums[nums.length - 2];
        return (max1 * max2) - (min1 * min2);
    }
}
