// 20/04/2025
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0;
        int end = 0;
        HashSet<Character> set = new HashSet<>();


//remove
        while(end <n){
if(set.contains(s.charAt(end))){
    while(start<end && set.contains(s.charAt(end))){

    set.remove(s.charAt(start));
    start++;
    }

}
    //add
    set.add(s.charAt(end));

maxLen = Math.max(maxLen,end-start+1);
end++;
        }
        return maxLen;
    }
}