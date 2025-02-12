/*
 1)BrutForce Solution -- O(n^2)
//  class MajorityElementPro {
//     public int majorityElement(int[] nums) {
//         /*
//         1. HashMap
//         2. 
//         */

//         int n = nums.length;
//         for(int i = 0;i<n;i++){
//         int count  = 0;
//             for(int j = 0;j<n;j++){
//                     if(nums[i] ==nums[j]){
//                         count++;
//                         if(count > n/2){
//                             return nums[j];
//                         }
//                     }
//             }
//         }
//         return -1;

//     }
// }


//  2) Use HAshMap --- O(nlogn)
// import java.util.*;
// class MajorityElementPro{

//     public int Solution(int nums[]){
//         int n = nums.length;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i = 0;i<n;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
//         n = n/2;
//         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//             if (entry.getValue() > n) {
//                 return entry.getKey();
//             }
//         }
//         return -1;
//     }


    //  3) Use Moore Voting Algo  --- O(n)

    class MajorityElementPro {
        public int majorityElement(int[] nums) {
            int count = 0;
            Integer candidate = null;
    
            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }
    
            return candidate;
        }
    





    public static void main(String args[]){
        int nums[] = {2,2,1,1,1,2,2};
        MajorityElementPro obj = new MajorityElementPro();
       int result = obj.majorityElement(nums);
       System.out.println(result);
    }
}




