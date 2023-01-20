package Strings.stringPrac;

public class GoalParser {
    public static void main(String[] args) {
        System.out.println();
    }
    public String interpret(String command) {


        StringBuilder str= new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i)=='G'){
                str.append('G');
            }
            if (command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str.append('o');
            }
            if (command.charAt(i)=='(' && command.charAt(i+1)=='a' &&command.charAt(i+2)=='l' && command.charAt(i+3)==')'){
             str.append("al");
            }
        }

        return str.toString();

    }
    //optimise
    public String interpret2(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); ++i) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append(c);
            }else if (c == '(' && command.charAt(i + 1) == ')') {
                sb.append("o");
                ++i;
            }else {
                sb.append("al");
                i += 3;
            }
        }
        return sb.toString();
    }
}
