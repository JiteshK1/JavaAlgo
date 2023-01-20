package Strings.stringPrac;

public class ReverseIII {

    public static void main(String[] args) {
        String s = "let there";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
     int l = 0 ;
     int r=0;
     char[] ch = s.toCharArray();
     while (l<ch.length){
         while (r<ch.length && s.charAt(r)!=' '){
             r++;
         }
         reverse(ch,l,r-1);
      l=r+1;
      r=l;
     }
        return String.valueOf(ch);
    }

    private static void reverse(char[] ch, int l, int r) {


        while (l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
    }
}
