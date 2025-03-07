//Link ----> https://takeuforward.org/data-structure/majority-elementsn-3-times-find-the-elements-that-appears-more-than-n-3-times-in-the-array/



// Approach
/*
 Optimal Approach: Moore’s Voting Algorithm:
Intuition:
If the array contains a majority element, its occurrence must be greater than the floor(N/2). Now, we can say that the count of minority elements and majority elements is equal up to a certain point in the array. So when we traverse through the array we try to keep track of the count of elements and the element itself for which we are tracking the count. 

After traversing the whole array, we will check the element stored in the variable. If the question states that the array must contain a majority element, the stored element will be that one but if the question does not state so, then we need to check if the stored element is the majority element or not. If not, then the array does not contain any majority element.
 */


import java.util.*;
class MajorityElementbyn{

    public static List<Integer> majorityElement(int []nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> majorityElements = new ArrayList<>();
int limit = nums.length/3;


for(Map.Entry<Integer,Integer>e:map.entrySet()){
    int element = e.getKey();
    int count = e.getValue();


if(count > limit){
    majorityElements.add(element);

}
}
return majorityElements;
    }

public static void main(String args[]){
int nums[] = {3,2,3};

System.out.println(majorityElement(nums));
    }
}