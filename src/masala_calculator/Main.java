package masala_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidInputException, MaxInputException, CannotDivideBy0 {
        int ans = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first No: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second No: ");
        int b = scanner.nextInt();

        System.out.println(" For addition enter : 1 \n" +
                "For subtraction enter : 2 \n" +
                "For multiplication enter : 3 \n" +
                "For division enter : 4  \n");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                ans = addition(a, b);
                System.out.println("addition is " + ans);
                break;
            case 2:
                ans = subtraction(a, b);
                System.out.println("subtraction is " + ans);
                break;
            case 3:
                ans = multiplication(a, b);
                System.out.println("multiplication is " + ans);

                break;
            case 4:
                ans = division(a, b);
                System.out.println("division is " + ans);
                break;
            default:
                throw  new InvalidInputException("Invalid Input");
        }
    }

    private static int division(int a, int b) throws CannotDivideBy0, MaxInputException {
        if (a >=100000 || b>=100000) throw  new MaxInputException("Max input Reached");
      if(b<=0){
          throw  new CannotDivideBy0("Number cannot be divided by Zero");
      }
      return a/b;

    }

    private static int multiplication(int a, int b) throws MaxInputException {
        if (a >=100000 || b>=100000) throw  new MaxInputException("Max input Reached");

        return  a *b;
    }

    private static int subtraction(int a, int b) throws MaxInputException {
        if (a >=100000 || b>=100000) throw  new MaxInputException("Max input Reached");

        return  a -b;
    }

    private static int addition(int a, int b) throws MaxInputException {
        if (a >=100000 || b>=100000) throw  new MaxInputException("Max input Reached");

        return a + b;
    }
}
