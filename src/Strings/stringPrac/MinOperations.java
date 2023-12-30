package Strings.stringPrac;

public class MinOperations {
    public static void main(String[] args) {

        System.out.println(
                minOperations("10010100")
        );
    }
    public static int minOperations(String s) {

        char[] chars= s.toCharArray();
      int counter=0;
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i]==chars[i+1]){
                if (chars[i]=='0'){
                    chars[i+1]='1';
                    counter+=1;
                }else{
                    chars[i+1]='0';
                    counter+=1;

                }
            }
            }

        return counter;
    }
}
