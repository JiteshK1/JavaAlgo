package Recursion.string;

import java.util.Objects;

public class StrLength {
    public static void main(String[] args) {
        System.out.println(length("avbsdwa"));
    }


    static int length(String str){
        int count=0;
        return helper(str,count);
    }
    static int helper(String str, int count){
      if (Objects.equals(str, "")){
          return count;
      }

        return helper(str.substring(1),++count);

    }
}
