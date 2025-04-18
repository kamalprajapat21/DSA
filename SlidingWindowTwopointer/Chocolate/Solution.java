class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int n = arr.size();
        Collections.sort(arr);
        int result =Integer.MAX_VALUE;
        for(int i = 0;i<n-m+1;i++){
            int low = arr.get(i);
            int high = arr.get(i+m-1);
            result = Math.min(result,high-low);
        }
        return result;
    }
}