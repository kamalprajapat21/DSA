public class LargestsumofK{
    public static int largestSum(int[] arr, int k) {
int length = 0;
int n = arr.length;
        for(int  i = 0;i<n;i++){
            int sum  = 0;

            for(int j = i;j<n;j++){
                sum = sum + arr[j];
                if(sum == k){
length = Math.max(length,j-i+1);                }
            }

        }
        return length;
    }
    public static void main(String []args){
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        int k = 0;
        System.out.println(largestSum(arr, k));
    }
}