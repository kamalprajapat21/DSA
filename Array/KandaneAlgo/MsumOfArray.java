
import java.util.*;

public class MsumOfArray {
    public long maxSubarraySum(int[] arr, int n) {
        long maxi = arr[0];
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

       
if(maxi<0){
    maxi = 0;
}
        return maxi;
    }

    public static void main(String args[]) {
        int[] arr = { -2, -1, -3, -4, -1,-2, -1, -5, -4};
        int n = arr.length;
        MsumOfArray obj = new MsumOfArray();
        long maxSum = obj.maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

}

