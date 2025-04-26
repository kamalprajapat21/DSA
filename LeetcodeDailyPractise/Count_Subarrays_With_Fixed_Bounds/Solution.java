class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int minflag = -1;
        int maxflag = -1;
        int badflag = -1;
        int ans = 0;
        for(int i = 0;i<n;i++){
if(nums[i] < minK || nums[i]> maxK){
    badflag = i;
}
if(nums[i] == minK){
minflag = i;
}
if(nums[i] == maxK){
    maxflag = i;
    }

    ans += Math.max(0,Math.min(minflag,maxflag)-badflag);
        }
        return ans;
        
    }
}