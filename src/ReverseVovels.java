public class ReverseVovels {
    public static void main(String[] args) {
        String s ="hello";
        System.out.println(reverseVowels(s));
    }
    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
    public  static void swap(char[] ch,int x,int y){
        char temp =ch[x];
        ch[x]=ch[y];
        ch[y]=temp;

    }
    public static   String reverseVowels(String s){
   int start = 0;
   int end = s.length()-1;
   char[] ch = s.toCharArray();

   while (start<end){
       while (start < s.length() && !isVowel(ch[start])){
           start++;
       }
       while (end>=0 && !isVowel(ch[end])){
           end--;
       }

       if (start < end){
           swap(ch,start++,end--);
       }
   }
   return String.valueOf(ch);
    }

}
