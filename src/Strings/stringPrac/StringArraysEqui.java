package Strings.stringPrac;

public class StringArraysEqui {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String ans= "";
        String ans2="";
        for (int i = 0; i < word1.length; i++) {
            ans+=word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            ans2+=word2[i];
        }
        if (ans.equals(ans2)) return true;
        return false;
    }
}
