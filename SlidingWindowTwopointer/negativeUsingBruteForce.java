/////BruteForce Approach


import java.util.*;

public class negativeUsingBruteForce{
    static List<Integer>FirstNegativeInteger(int arr[], int k) {
        // write code here
        int n = arr.length;
        List<Integer>result = new ArrayList<>();
        for(int i = 0;i<n-k+1;i++){
            boolean flag = false;
            for(int j = i;j<i+k;j++){
                if(arr[j]<0){
                    result.add(arr[j]);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result.add(0);
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(FirstNegativeInteger(arr, k));
    }
}