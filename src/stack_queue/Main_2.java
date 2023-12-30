package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Main_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int m = s.nextInt();
            int x = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = s.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = s.nextInt();
            }
            System.out.println(TwoStacksGame.twoStack(x, a, b));
        }
    }
}
