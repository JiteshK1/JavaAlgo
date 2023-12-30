package Strings;

public class Main {

    public static void main(String[] args) {
        StringBuilder sc =new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+ i);
              sc.append(ch);
        }
//        System.out.println(sc);

        System.out.println(
                reverse("abc")
        );

    }

    static String reverse(String s){
        StringBuilder builder=new StringBuilder();
        char[] ch=s.toCharArray();

        for (int i = ch.length-1; i >=0 ; i--) {
            builder.append(s.charAt(i));

        }

        return builder.toString();
    }


}
