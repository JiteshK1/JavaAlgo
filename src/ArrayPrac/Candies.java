package ArrayPrac;

import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<Boolean>();
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
