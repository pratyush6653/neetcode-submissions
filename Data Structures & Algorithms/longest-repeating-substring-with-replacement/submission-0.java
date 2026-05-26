class Solution {
    public int characterReplacement(String s, int k) {
         int[] freq = new int[26];   // since only uppercase letters
        int left = 0;
        int maxFreq = 0;           // most frequent char in current window
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // 1. include current character
            freq[s.charAt(right) - 'A']++;

            // 2. update max frequency
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // 3. check if window invalid
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // 4. update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
