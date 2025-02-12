/*
 Why Use Arrays.toString(nums) Instead of a Loop?
✅ Easier & Cleaner → No need to write a loop manually.
✅ Built-in Formatting → Adds brackets and commas automatically.
✅ Works with Any Array Type → Can be used with int[], double[], char[], etc.



Alternative: Printing with a Loop
You could also use a loop, but it's more verbose:

java
Copy
Edit
for (int num : nums) {
    System.out.print(num + " ");
}
 */

import java.util.*;
class flagProblem {

    
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int mid = 0;
        int right = n-1;
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums,left,mid);
                mid++;
                left++;
            }
            else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,right);
                right--;
            }
        }
    }
    private void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String args[]){
        int nums[] = {2,0,2,1,1,0};
        flagProblem obj = new flagProblem();
       obj.sortColors(nums);
       System.out.println(Arrays.toString(nums)); 
    }
}
