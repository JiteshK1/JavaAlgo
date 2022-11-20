package BSprac;

public class SpecialArrayX {
    public static void main(String[] args) {
        int[] arr = {0,4,3,0,4};
        System.out.println(specialArray(arr));
    }
    public int specialArray2(int[] nums) {
        for(int i = 1; i<=nums.length;i++){
            int count=0;
            for(int num : nums){
                if(num>=i){
                    count++;
                }
            }
            if(count == i) return i;
        }
        return -1;
    }
    public static int specialArray(int[] nums) {
      int start=0;
      int end = nums.length;
      while (start<=end){
          int mid = start + (end-start)/2;
          int count=0;
          for (int i = 0; i < nums.length; i++) {
              if (nums[i]>=mid) count++;
          }
          if (count==mid) return mid;

          if (count>mid) start=mid+1;
          else end=mid-1;
      }

       return -1;
    }
}
