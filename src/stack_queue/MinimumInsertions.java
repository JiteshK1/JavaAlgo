package stack_queue;

import java.util.Stack;

public class MinimumInsertions {
    public static void main(String[] args) {

        System.out.println(
                minInsertions("(")
        );
    }

    static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == ')') {
                if ( s.charAt(i + 1) == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push('(');
                        count += 1;
                    }
                } else {
                    stack.push(')');
                    count += 1;

                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return count;
    }
}