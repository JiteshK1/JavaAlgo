package Strings;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        double sum=0.0;
        Scanner scanner=new Scanner(System.in);
    while (true){
           String input = scanner.next();
           if (input.equalsIgnoreCase("x")) {
               break;
           }

        try {
            double number = Double.parseDouble(input);
            sum += number;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number or 'x'.");
        }

    }
        System.out.println(sum);
    scanner.close();
    }
}
