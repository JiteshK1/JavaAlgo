package BSprac;

public class GuessNo {
    public static int guess(int num){
        // check leetCode
       return num;
    }
    public static int guessNumber(int n){
        int start = 0;
        int end = n;
        while (start<=n){
            int mid = start + (end-start)/2;
            int val =  guess(mid);
            if (val ==1){
                start=mid+1;
            }else if(val == -1){
                end=mid-1;
            }else {
                return mid;
            }
        }
        return 0;

    }
}
