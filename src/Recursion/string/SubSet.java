package Recursion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1, 2,3};
        ArrayList<ArrayList<Integer>> main= subset(arr);
        for (var list:main){
            System.out.println(list);
        }
    }

    static ArrayList<ArrayList<Integer>> subset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
         for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }

        }


        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start=0;
            if (i>0&&arr[i]==arr[i-1]){
                 start=end+1;
             }
             end=outer.size()-1;
             int n=outer.size();
            for (int j = start; j <n ; j++) {
                ArrayList<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
    return outer;
    }
}
