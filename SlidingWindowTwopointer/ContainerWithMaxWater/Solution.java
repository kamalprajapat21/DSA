class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int volume = 0;
        int maxVolume = 0;
        while(left<right){
            int width = right-left;
           int h = Math.min(height[right],height[left]);
           volume = h * width;
           maxVolume = Math.max(volume,maxVolume);

           if(height[left]<height[right]){
            left++;
           }else{

           right--;
           }
        }
        return maxVolume;
    }
}