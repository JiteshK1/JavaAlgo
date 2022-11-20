package ArrayPrac;

import java.util.Arrays;

public class Seggreagate {
    public static void main(String[] args) {
int arr[]={0,1,1,0,1};

 seg(arr);
        System.out.println(Arrays.toString( arr ));



    }

    public static void seg(int[] arr){
        int s = arr[0];
        int e =arr.length -1;

    while (s < e){

        while (arr[s] == 0 && s < e){
            s++;
        }
        while (arr[e] == 1 && s < e){
            e--;
        }

        if (s < e){
            arr[s] = 0;
            arr[e] = 1;
            s++;
            e--;
        }
    }
    }
}
