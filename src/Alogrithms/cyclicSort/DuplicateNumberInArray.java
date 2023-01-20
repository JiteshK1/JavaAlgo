package Alogrithms.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumberInArray {
    public static void main(String[] args) {
     int[] arr={4,3,2,7,8,3,2,1};
        System.out.println(sort(arr));
    }
    public static List<Integer> sort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int j = 0; j < arr.length ; j++) {
           if (arr[j]!=j+1){
               list.add(arr[j] );
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
