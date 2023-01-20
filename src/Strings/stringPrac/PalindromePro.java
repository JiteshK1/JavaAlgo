package Strings.stringPrac;

public class PalindromePro {
    public boolean isPalindrome(String s) {
       String str= s.toLowerCase();
     String str2 = str.replaceAll("[^a-zA-Z0-9]","");
    int start=0;
     int end=str2.length()-1;
        while(start<end){
        if (str2.charAt(start)==str2.charAt(end)){
            start++;
            end--;
        }else {
            return false;
        }
    }
        return true;
    }
}
