package ArrayPrac;

import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        String original, reverse = ""; // Objects of String class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        original = sc.nextLine();
        int length = original.length();

        for (int i = length - 1; i >= 0 ; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }

    static boolean isPalindrome(int n) {
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n /= 10;
        }
        return sum == temp;
    }
}
