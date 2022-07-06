package com.nami.solutions.from401to500;

public class _485MaxConsecutiveOnes {
    public static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0;
            int max = 0;
            for (int num : nums){
                max = Math.max(max, count = num == 0 ? 0 : count +1);
            }
            return max;
        }
    }
}
