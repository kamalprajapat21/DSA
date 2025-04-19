class Solution {
    public void moveZeroes(int[] nums) {
        int postion = 0;
        for(int num : nums){
            if(num !=0){
                nums[postion++] = num;
            }
        }
        while(postion<nums.length){
            nums[postion++] = 0;
        }
    }
}