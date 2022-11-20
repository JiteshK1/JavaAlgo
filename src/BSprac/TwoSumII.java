package BSprac;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
    }

    public static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;
        int[] a = new int[2];
        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                break;
            }
            if (numbers[start] + numbers[end] < target) start++;
            else {
                end--;
            }
        }
        a[0] = start + 1;
        a[1] = end + 1;
        return a;
    }
}
