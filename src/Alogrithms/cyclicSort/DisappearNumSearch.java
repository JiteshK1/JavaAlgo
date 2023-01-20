package Alogrithms.cyclicSort;

import java.util.ArrayList;

public class DisappearNumSearch {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(sort(arr));
    }

    public static ArrayList<Integer> sort(int[] arr){
        int index=0;
        while (index< arr.length){
            int correct = arr[index]-1;
            if (arr[index]!=arr[correct]){
                swap(arr,index,correct);
            }else {
                index++;
            }
        }
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }
    private static void swap(int[] arr, int fIndex, int lIndex) {
        int temp = arr[fIndex];
        arr[fIndex]=arr[lIndex];
        arr[lIndex]=temp;
    }

}
