package heaps;

import java.util.LinkedList;
import java.util.Queue;

public class CountSub {
    public static void main(String[] args) {

        long arr[] = {9 ,5 ,3 ,8};
        System.out.println(
                countSub(arr,4)
        );
    }
    public static boolean countSub(long arr[], long n) {
        Queue<Long> queue = new LinkedList<>();
        queue.offer(arr[0]);

        for (int i = 1; i < n; i++) {
            long big = queue.remove();
            if (arr[i] > big) {
                return false;
            }
            queue.offer(arr[i]);

            if (i + 1 < n) {
                if (arr[i + 1] > big) {
                    return false;
                }
                queue.offer(arr[i + 1]);
                ++i;
            }
        }
        return true;
    }
}
