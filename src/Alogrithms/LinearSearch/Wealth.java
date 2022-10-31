package Alogrithms.LinearSearch;

public class Wealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,2},
                {2,1,1},
                {1,1,2,2,4}
        };
        System.out.println(sumSearch(arr));
    }
    private  static  int sumSearch(int[][] accounts){
        int max = 0;


        for (int person = 0; person <accounts.length ; person++) {
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum+= accounts[person][account];
            }
            if (rowSum > max)  max = rowSum;

        }
        return max;
    }
}
