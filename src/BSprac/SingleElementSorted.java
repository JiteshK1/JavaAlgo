package BSprac;

public class SingleElementSorted {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,5};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end){
            int mid = (start + end)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                start = mid + 1;
            else
                end = mid;
        }
        return nums[start];
      }
    }

