package BSprac;

public class RBS2 {
    public boolean search(int[] arr, int target) {
     int start = 0 ;
     int end = arr.length-1;

     while(start<=end){
         int mid = start + (end-start)/2;

         if (arr[mid]==target) return  true;

         if (arr[start]==arr[mid] && arr[mid]==arr[end]){
             start++;
             end--;
         }
         else if (arr[start]<=arr[mid]){
             if (arr[start]<=target && target <=arr[mid]){
                 end=mid-1;
             }else {
                 start=mid+1;
             }
         }else {
             if (arr[mid]<=target && arr[end]>=target){
                 start=mid+1;

             }else {
                 end=mid-1;
             }
         }
     }
     return false;
    }
}
