package ArrayPrac;

public class SpecialInteger {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,6,6,6,7};
        System.out.println(
                findSpecialInteger(arr)
        );
    }
    public static int findSpecialInteger(int[] arr) {
        int size=arr.length;
        int qtr=size/4;
        int p=arr[0];
        int count=1;

        for(int i = 1; i<size; i++ ){
            if(p==arr[i]){
                count++;
            }else{
                count=1;
            }
            if(count>qtr){
                return arr[i];
            }else{
                p=arr[i];
            }
        }

        return p;

    }
}
