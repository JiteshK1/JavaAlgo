package Strings.stringPrac;

public class LargestSubstring {
    public static void main(String[] args) {
    }

    public int maxLengthBetweenEqualCharacters(String s) {

     int ans=-1;

        for (int left = 0; left < s.length(); left++) {
            for (int right = 1; right < s.length() ; right++) {
                if (s.charAt(left)==s.charAt(right)){
                    ans=Math.max(ans,right-left-1);
                }
            }
        }

        return ans;
    }
}
