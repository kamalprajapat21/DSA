class Solution {
    public boolean isSubsequence(String s, String t) {
        int ns = s.length();
        int nt = t.length();
        int i = 0;
        int j = 0;

        while(i<ns && j < nt){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==ns;
    }
}













/*
 Intuition
We need to check if all characters of string s appear in string t in order (not necessarily consecutively). This sounds like a classic two-pointer problem where we try to match characters in s as we move through t.

Approach
We use two pointers i and j to iterate through strings s and t respectively:

If s.charAt(i) matches t.charAt(j), we move both pointers.
If they don't match, we move only j.
If i reaches the end of s, that means all characters of s are found in t in the correct order.
 */