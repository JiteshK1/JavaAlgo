package ArrayPrac;

import java.util.*;

public class ArrayForm {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1,2,0,0},22));

    }
    public static List<Integer> addToArrayForm(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry =0;
        for (int i = arr.length-1; i >=0 ; i++) {
            arr[i]=arr[i] + k%10+ carry;
            list.add(arr[i]%10);
            carry=arr[i]/10;//updates carry
            k/=10;
        }
        k+=carry;
        while (k!=0){
            list.add(k%10);
            k/=10;
        }

        Collections.reverse(list);
        return list;
    }
}
