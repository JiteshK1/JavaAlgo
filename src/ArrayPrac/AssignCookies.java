package ArrayPrac;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g={10,9,8,7};
        int[] s={5,6,7,8};

        System.out.println(
                findContentChildren(g,s)
        );

    }

    public static int findContentChildren(int[] g, int[] s) {
//start by sorting as  no of child consent and cookies should be largest at the end;

        if(s.length==0) return 0;

        int cookiesIndex=s.length-1;
        int childIndex=g.length-1;
        Arrays.sort(g);
        Arrays.sort(s);

        int maxNum = 0;
        while (cookiesIndex>=0 && childIndex>=0){
            if (s[cookiesIndex]>=g[childIndex]){
                maxNum++;
                cookiesIndex--;
                childIndex--;
            }else {
                childIndex--;

            }
        }
return maxNum;
    }
}
