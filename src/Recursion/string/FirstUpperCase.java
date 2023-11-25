package Recursion.string;

public class FirstUpperCase {

    public static void main (String[] args) {
        String str = "geeks";
        System.out.println(get(str,0));
    }

    static char get( String str,int i){
         if (i >= str.length()){
             return '0';
         }
         if (Character.isUpperCase(str.charAt(i))){
             return  str.charAt(i);
         }
         return get(str,i+1);


    }
}
