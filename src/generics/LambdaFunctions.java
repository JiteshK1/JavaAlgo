package generics;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
//list.forEach((item)-> System.out.println(item * 2));

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunctions calculator = new LambdaFunctions();
        System.out.println(calculator.operate(5, 3, sum));
        System.out.println(calculator.operate(5, 3, sub));
        System.out.println(calculator.operate(5, 3, prod));


    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    interface Operation {
        int operation(int a, int b);
    }
}


