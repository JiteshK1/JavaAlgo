package BSprac;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt2(8));
    }
    public static int sqrt2(int x){
        long low =  1;
        long high = x;
        long ans = 0;
        while(low <= high){
            long mid = (low+high)/2;
            if(mid*mid < x){
                low = mid + 1;
                ans = mid;
            }
            else if(mid*mid > x){
                high = mid - 1;
            }
            else{
                return (int)mid;
            }
        }
        return (int)ans;
    }
public static int sqrt(int x){
    if (x <= 0) return x;
    int st = 1;
    int end = x / 2;
    while (st < end) {
        int mid = (end + st) / 2 + 1;
        int div = x / mid;
        if (div == mid) return mid;
        if (div > mid) st = mid;
        else end = mid - 1;
    }
    return st;
}
}

