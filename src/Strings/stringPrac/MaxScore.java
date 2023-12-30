package Strings.stringPrac;

public class MaxScore {
    public int maxScore(String s) {
        int maxScore = 0;
    int countZeroLeft=0;
    int countOnesRight= (int) s.chars().filter(ch->ch=='1').count();

        for (int i = 0; i < s.length()-1; i++) {
            countZeroLeft+= s.charAt(i)=='0'?1:0;
            countOnesRight-=s.charAt(i)=='1'?1:0;

            maxScore=Math.max(maxScore,countZeroLeft+countOnesRight);
        }
return maxScore;
    }
}
