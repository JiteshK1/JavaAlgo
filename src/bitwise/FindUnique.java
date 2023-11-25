package bitwise;

public class FindUnique {
    public static void main(String[] args) {
int[] arr={2,3,3,4,2,6,4};
int[] arr2={-2,3,2,4,-5,5,-4};
        System.out.println(sum(arr2));
        System.out.println(ans(arr));
    }

    static int ans(int[]arr){
        int unique=0;
        for (int n:arr){
            unique^=n;
        }
        return unique;
    }
    static int sum(int[] arr){
        int sum=0;
        for (int n:arr){
            sum+=n;
        }
        return sum;
    }
}
