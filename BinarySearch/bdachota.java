/*
 Problem statement
You're given a sorted array 'a' of 'n' integers and an integer 'x'.



Find the floor and ceiling of 'x' in 'a[0..n-1]'.



Note:
Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
Ceiling of 'x' is the smallest element in the array greater than or equal to 'x'.


Example:
Input: 
n=6, x=5, a=[3, 4, 7, 8, 8, 10]   

Output:
4
*/




// --------->  logic -------
/*
 Why Use Arrays.toString(result)?
When you print an array in Java using System.out.println(result);, it does not print the elements. Instead, it prints a memory reference, something like this:

graphql
Copy
Edit
[I@1b6d3586
This is because Java does not automatically convert arrays to human-readable strings.

✅ Solution: Use Arrays.toString(result)
Arrays.toString(result) correctly formats the array as a string.

Example Without Arrays.toString()
 */

import java.util.*;
 class bdachota{
     static int[] solution(int arr[],int x){
        int n = arr.length;
        int floor = -1;
        int ceil = -1;
        int low = 0;
        int high = n-1;
        while(low<= high){
            int mid = low+high/2;
            if(arr[mid] == x){
                return new int []{x,x};
            }
            else if(arr[mid] > x){
                ceil = arr[mid];
                high = mid-1;
            }else{
                floor = arr[mid];
                low = mid+1;
            }
        }
        return new int[]{floor,ceil};

    }
    public static void main(String args[]){
int arr[] = {3, 4, 7, 8, 8, 10};
int x = 5;
int[] result = solution(arr,x);  
// System.out.println(result);  }
System.out.println(Arrays.toString(result));  }

}