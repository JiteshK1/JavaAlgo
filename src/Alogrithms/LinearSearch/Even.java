package Alogrithms.LinearSearch;

public class Even {
    public static void main(String[] args) {
        int[] arr ={ -12,2,4442,3243};
        System.out.println(totalnum(arr));
        System.out.println(digits2(23214));
    }

    private static int totalnum(int[] arr) {
        int count = 0;

        for(int num : arr){
            if (even(num)){
                count ++;
            }
        }
    return count;
    }

    private static boolean even(int num) {
        return digits(num) % 2 ==0;
    }

    private  static  int digits2(int num){
        return (int)Math.log10(num) + 1;
    }
    private  static  int digits(int num){
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0 ) return 1;
        int count = 0;
        while (num > 0){
            num = num/ 10;
            count++;
        }
        return count;
    }
}
