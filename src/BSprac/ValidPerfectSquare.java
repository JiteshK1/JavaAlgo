package BSprac;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num){
        long start = 1;
        long end = num;
        while (start<=num){
            long mid = start + (end-start)/2;
            if(mid*mid==num) return true;
            if(mid*mid < num){
                start=mid+1;
            }else{
                end=mid -1;
            }
        }
        return false;
    }
}
