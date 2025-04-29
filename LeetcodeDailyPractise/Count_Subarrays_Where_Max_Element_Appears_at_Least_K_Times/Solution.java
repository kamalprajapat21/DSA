class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        for(int num : nums){
            maxi = Math.max(maxi,num);
        }

        int right = 0;
        int left = 0;
        int Occurence = 0;
        long res = 0;
        for(right = 0;right<nums.length;right++){
            if(nums[right] == maxi) Occurence++;

            while(Occurence>=k){
                if(nums[left] == maxi) Occurence--;
                left++;
            }
            res+=left;
        }
        return res;
    }
}