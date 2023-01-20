package Strings.stringPrac;

public class ReversePrefixOfWord {
   public static void main(String[] args) {
      String str="ramdasMohan";
      char ch='M';
      String prefix=str.substring(0,str.indexOf(ch));
      System.out.println(prefix);
   }
   public String reversePrefix(String word, char ch) {
      //make two substrings
      String prefix = word.substring(0,word.indexOf(ch)+1);
      String suffix=word.substring(word.indexOf(ch)+1);
      StringBuilder sb=new StringBuilder(prefix);
      sb.reverse();
      sb.append(suffix);

      return sb.toString();

   }
   }
// word = "abcdefd" and ch = "d"  "dcba efd".
