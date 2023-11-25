package Recursion.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 3, 1, 1, 4, 24, 55};
        System.out.println(search(arr, 111, 0));
        ArrayList<Integer> list1 = new ArrayList<>();
        find2(arr, 1, 0);

        System.out.println(list);
        System.out.println(find3(arr, 1, 0, list1));
        System.out.println(find5(arr,1,0));
    }

    static int search(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if (arr[index] == target) {
            return index;
        }

        return search(arr, target, index + 1);
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) return false;

        return arr[index] == target || find(arr, target, index + 1);
    }

//if we want to find multiple index target of same element

    static ArrayList<Integer> list = new ArrayList<>();

    static void find2(int[] arr, int target, int index) {
        if (index == arr.length) return;

        if (arr[index] == target) list.add(index);

        find2(arr, target, index + 1);
    }

    static ArrayList<Integer> find3(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length)
            return list;

        if (arr[index] == target) list.add(index);

        return find3(arr, target, index + 1, list);
    }

    static ArrayList<Integer> find5(int[] arr, int target, int index) {
        ArrayList<Integer> list=new ArrayList<>();
        if (index == arr.length)
            return list;

        if (arr[index] == target) list.add(index);

        ArrayList<Integer> ansFromBelowCalls=find5(arr,target,index+1);
        list.addAll(ansFromBelowCalls);

        return list;

    }

    }
