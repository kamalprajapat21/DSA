
/*https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/ */

public class MaximumSumofSubArray{

    static int Solution(int arr[]){
        int n = arr.length;
        int csum = 0;
        int msum = 0;
        for(int i = 0;i<n-1;i++){
            csum = arr[i] + arr[i+1];
            msum = Math.max(csum,msum);
        }
        return msum;
    }
    public static void main(String[]args){
        int arr[] = {4, 3, 1, 5, 6};
        System.out.println(Solution(arr));
    }
}