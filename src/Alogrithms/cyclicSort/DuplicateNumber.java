package Alogrithms.cyclicSort;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(sort(arr));
    }
    public static int sort(int[] arr){
        int index=0;
        while(index<arr.length) {
        if (arr[index]!=index+1){
            int correct = arr[index]-1;
            if (arr[index]!=arr[correct]){
                swap(arr,index,correct);
            }else {
                return arr[index];
            }
        }else {
            index++;
        }
        }
        return -1;
    }

    private static void swap(int[] arr, int index, int correct) {
            int temp = arr[index];
            arr[index]=arr[correct];
            arr[correct]=temp;
    }
}
