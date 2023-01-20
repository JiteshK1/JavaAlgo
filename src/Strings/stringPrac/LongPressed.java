package Strings.stringPrac;

public class LongPressed {
    public static void main(String[] args) {
        String a="alex";
        String b="aaleex";
        System.out.println(isLongPressedName(a,b));
    }
    public static boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed))return true;
        if (typed.length()<name.length()) return false;
        int i=0;
        int j=0;
        while (j<typed.length()){
            if (i<name.length() && name.charAt(i)==typed.charAt(j)){
                i++;
            }else if (j==0|| typed.charAt(j)!=typed.charAt(j-1)){
                return false;
            }
            j++;
        }

        return i==name.length();

    }
}
