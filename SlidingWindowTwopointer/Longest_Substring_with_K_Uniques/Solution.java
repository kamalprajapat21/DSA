class Solution {
    public int longestkSubstr(String s, int k) {
        int[] freq = new int[26];
        int i = 0, j = 0, uniqueCount = 0;
        int maxLength = -1;

        while (j < s.length()) {
            char c = s.charAt(j);
            int idx = c - 'a';

            // Add character to window
            if (freq[idx] == 0) {
                uniqueCount++;
            }
            freq[idx]++;

            // Shrink window if uniqueCount exceeds k
            while (uniqueCount > k) {
                char startChar = s.charAt(i);
                int startIdx = startChar - 'a';
                freq[startIdx]--;
                if (freq[startIdx] == 0) {
                    uniqueCount--;
                }
                i++;
            }

            // Update answer if exactly k unique characters
            if (uniqueCount == k) {
                maxLength = Math.max(maxLength, j - i + 1);
            }

            j++;
        }

        return maxLength;
    }
}
