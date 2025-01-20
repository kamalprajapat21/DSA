public class largestsumofKoptimization{
     public static int largestSum(int[] arr, int k) {
int r = 0;int l = 0;int n = arr.length;
int sum = 0; int maxlength = 0;
while(r<n){
sum  = sum + arr[r];

while(sum > k && l <= r){
    sum = sum - arr[l];
    l++;
}

if(sum == k){
    maxlength = Math.max(maxlength, r-l+1);
}
r++;
}
        
return maxlength;
       
    }
    public static void main(String []args){
        int[] arr = {-59, -25, 58, -59, -25, 58};
        int k = -85;
        System.out.println(largestSum(arr, k));
    }
}