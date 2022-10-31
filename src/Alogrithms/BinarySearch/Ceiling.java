package Alogrithms.BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
      int[] arr = {2,3,5,9,14,14,16};
          int target = 15;
        System.out.println(ceiling(arr,target));
    }

    public static  int ceiling(int[] arr , int target){

        if (target > arr[arr.length - 1]) return -1;

        int s = arr[0];
        int e = arr.length -1 ;

        while (s <= e){
            int mid = s + (e - s)/2;
            if (target > arr[mid]){
                s = mid + 1;
            }else if (target < arr[mid]) {
                e = mid - 1;
            }
            if (target == arr[mid]) return mid;

        }
        return  s;
    }
}
