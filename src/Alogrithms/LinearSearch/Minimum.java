package Alogrithms.LinearSearch;

public class Minimum {
    public static void main(String[] args) {
        int[] arr={22,11,44,54,23,77,2};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        if (arr.length == 0) return -1;
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]< ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}
