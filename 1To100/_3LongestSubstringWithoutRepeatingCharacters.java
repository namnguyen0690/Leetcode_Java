package com.nami.solutions.from1to100;

public class _3LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0)
                return 0;
            // Sliding Window technique
            int i = 0, j = 0, result = 0;
            Set<Character> chars = new HashSet<>();
            while (j < s.length()) {
                char c = s.charAt(j);
                while (chars.contains(c)) {
                    chars.remove(s.charAt(i));
                    i++;
                }
                chars.add(c);
                // the maximum size of substrings without duplicate characters start with index
                // i
                result = Math.max(result, j - i + 1);
                // slide the index j to the right
                j++;
            }
            return result;
        }
    }
}
