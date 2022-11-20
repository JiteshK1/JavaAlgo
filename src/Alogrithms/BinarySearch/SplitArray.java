package Alogrithms.BinarySearch;

public class SplitArray {
    public  static  int splitArray(int[] nums , int m){

        int start = 0;
        int end = 0;
        //so first we have to find upperLimit and lowerLimit
        for (int i = 0; i < nums.length-1; i++) {
            start=Math.max(start,nums[i]); // this will return maximum element in the array
            end+=nums[i];
        }

        while (start < end){
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for (int num : nums){
                if (sum + num> mid) //current sum + the num going on is exceeding the max number that is mid then
                {
                    sum = num;
                    pieces++;
                }else {
                    sum+=num;
                }
            }
            if (pieces > m){
                start= mid+1;
            }else {
                end = mid;
            }
        }
        return end;
    }
}
