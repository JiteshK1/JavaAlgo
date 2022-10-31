package Alogrithms.LinearSearch;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {41, 22, 55, 2, 5};
        int target = 22;
        System.out.println(search(arr, target, 1 ,2));

    }

    public static int search(int[] arr, int target, int s , int e) {
        if (arr.length == 0) return -1;
        for (int i = s; i <=e; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
