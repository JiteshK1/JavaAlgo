package Strings;

public class Main {

    public static void main(String[] args) {
        StringBuilder sc =new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+ i);
              sc.append(ch);
        }
        System.out.println(sc);

    }


}
