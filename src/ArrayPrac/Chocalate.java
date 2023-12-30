package ArrayPrac;

public class Chocalate {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(
             buyChoco(arr,3)
        );
    }
    public static int buyChoco(int[] prices, int money) {
       int min1 = Integer.MAX_VALUE;
       int min2 =Integer.MAX_VALUE;

        for (int price: prices){
            if (price<min1){
                min2=min1;
                min1=price;
            } else if (price<min2) {
                min2=price;
            }
        }
        int ans = min2 + min1;

        if (ans>money) return money;

        return money-ans;
    }
}
