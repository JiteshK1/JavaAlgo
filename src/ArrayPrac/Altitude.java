package ArrayPrac;

public class Altitude {
    public static int largestAltitude(int[] gain) {
       int max=0;
       int current=0;
        for (int j : gain) {
            current += j;
            max = Math.max(current, max);
        }
        return max;
    }
}
