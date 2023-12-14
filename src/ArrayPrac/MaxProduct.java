package ArrayPrac;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr={3,4,5,2};
        System.out.println(
                maxProduct(arr)
        );
    }
    public static int maxProduct(int[] nums) {
        int max1=0;
        int max2=0;
        int s=0;
        int e=nums.length-1;
        while(s<e){
            if(max1<nums[s]){
                max1=nums[s];
                s++;
            }else{
                s++;
            }
            if(max2<nums[e]){
                max2=nums[s];
                e--;
            }else{
                e--;
            }

        }
        max1=max1-1;
        max2=max2-1;
        return max1 * max2;
    }
}
