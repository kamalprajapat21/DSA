/*
 * Solution 1: Brute Force
Intuition: We have to think of a data structure that does not store duplicate elements. So can we use a Hash set? Yes! We can. As we know HashSet only stores unique elements.

Approach: 

Declare a HashSet.
Run a for loop from starting to the end.
Put every element of the array in the set.
Store size of the set in a variable K.
Now put all elements of the set in the array from the starting of the array.
Return K.
 */




 import java.util.*;
public class removeduplicateElementHashset{
    public static int sizeofarray(int arr [],int n){
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++){
        set.add(arr[i]);
        }

        int k = set.size();
    

    int j =0;
    for(int x:set){
        arr[j++] = x;
    }
    return k;
}
    public static void main(String[]args){
int arr[] = {1, 5, 3, 10, 4, 4, 4};
int n = 7;
System.out.println("Size of array is "+sizeofarray(arr,n));
System.out.print("Updated array: ");
        for (int i = 0; i < sizeofarray(arr,n); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}