package Alogrithms.cyclicSort;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,0};
        System.out.println(sort(arr));
    }

    public static int sort(int[] arr){
        int index=0;
        while (index< arr.length){
            int correct= arr[index];
            if (arr[index] < arr.length && arr[index]!=arr[correct]){
                swap(arr,index,correct);
            }else {
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i){
                return i;
            }
        }
        return arr.length;

    }
    private static void swap(int[] arr, int fIndex, int lIndex) {
        int temp = arr[fIndex];
        arr[fIndex]=arr[lIndex];
        arr[lIndex]=temp;
    }
}
