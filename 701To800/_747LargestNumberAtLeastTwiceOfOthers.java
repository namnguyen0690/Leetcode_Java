package com.nami.solutions.from701to800;

public class _747LargestNumberAtLeastTwiceOfOthers {
    class Solution {
        public int dominantIndex(int[] nums) {
            int maxIndex = 0;
            for (int i = 0; i < nums.length; i++){
                if (nums[i] > nums[maxIndex]){
                    maxIndex = i;
                }
            }
            for (int i = 0; i < nums.length; i++){
                if (maxIndex != i && nums[maxIndex] < nums[i] * 2){
                    return -1;
                }
            }
            return maxIndex;
        }
    }
}
