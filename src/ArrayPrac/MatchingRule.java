package ArrayPrac;

import java.util.List;

public class MatchingRule {
    public static void main(String[] args) {

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        if (ruleKey.equals("type")) {
            for (List<String> item : items) {
                if (item.get(0).equals(ruleValue)) {
                    ans++;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (List<String> item : items) {
                if (item.get(1).equals(ruleValue)) {
                    ans++;
                }
            }
        } else {
            for (List<String> item : items) {
                if (item.get(2).equals(ruleValue)) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static int countMatches2(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if (ruleKey.equals("type")) {
            index = 0;
        }
        if (ruleKey.equals("color")) {
            index = 1;
        }
        if (ruleKey.equals("name")){
            index=2;
        }
        int result=0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                result++;
            }
        }
        return result;
    }
}
