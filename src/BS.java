public class BS {
    public static void main(String[] args) {
int[] arr={1,4,5,6,7,11,22,55,85,444};

        printNos(64);
    }

    public static void printNos(int N)
    {

        if(N==1){
            System.out.println(N);
            return;

        }

        printNos(N-1);
        System.out.println(N);//Your code here
    }
    public static int search(int[] arr,int target,int start,int end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                return search(arr,target,mid+1,end);
            }
            if (target<arr[mid]){
                return search(arr,target,start,mid-1);
            }
            if (target==arr[mid]){
                return mid;
            }
        return -1;
    }
}
