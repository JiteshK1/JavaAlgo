package ArrayPrac;

public class GoodPair {
    public static void main(String[] args) {
int[] arr ={1,2,3,1,1,3};
        System.out.println(pair2(arr));
    }
    public static int pair(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int pair2(int[] nums){
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length -1; j > i ; j--) {
                if (nums[i] == nums[j]){
                    count++;
                }

            }

        }
        return count;
    }
}
