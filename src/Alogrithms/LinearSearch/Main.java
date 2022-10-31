package Alogrithms.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {41, 22, 55, 2, 5};
        int target = 2;
        System.out.println(search(arr, target));

    }

    public static int search(int[] arr, int target) {
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
