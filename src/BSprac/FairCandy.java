package BSprac;

public class FairCandy {
    public static void main(String[] args) {
        System.out.println(2);
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0,sumB=0;

        for(int x:aliceSizes){
            sumA+=x;
        }
        for(int x:bobSizes){
            sumB+=x;
        }
        for(int i =aliceSizes.length-1;i>=0;i--){
            for(int j=bobSizes.length-1;j>=0;j--){
                int diff = aliceSizes[i]-bobSizes[j];
                if(sumA - diff == sumB + diff) return new int[]{aliceSizes[i],bobSizes[j]};
            }
        }
        return new int[]{-1,-1};
    }
}
