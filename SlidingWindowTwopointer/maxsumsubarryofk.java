//MAX SUM OF SUBARRAY OF SIZE K///
//1---> Static method ko access karne ke liye className.method ka use kare
//2 ---> Non static Method ko access karne ke liye Object banaye (className.obj = new className();)
class maxsumsubarryofk {
    public int maximumSumSubarray(int[] arr, int k) {
       int mx = Integer.MIN_VALUE;
       int ans = 0;
       int i = 0;
       int j = 0;
       while(j<arr.length){
           ans = ans+arr[j];
           if(j-i+1<k){
               j++;
           } else if(j-i+1 == k){
               mx = Math.max(mx,ans);
               ans = ans-arr[i];
               i++;j++;
           }
       }
       return mx;
    }
/*G:\DSA\SlidingWindowTwopointer\maxsumsubarryofk.java */
    public static void main(String []args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 5;
        maxsumsubarryofk obj = new maxsumsubarryofk();
        System.out.println("Maximum sum of subarray of size "+k+" is "+ obj.maximumSumSubarray(arr,k));

    }
}