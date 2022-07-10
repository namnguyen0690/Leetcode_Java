package com.nami.solutions.from901to1000;

public class _977SquaresOfASortedArray {
    public static class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int left = 0;
            int right = n - 1;
            int[] result = new int[n];

            for(int i = n - 1; i >= 0; i--){
                int square;
                if(Math.abs(nums[left]) < Math.abs(nums[right])){
                    square = nums[right];
                    right--;
                }else {
                    square = nums[left];
                    left++;
                }
                result[i] = square * square;
            }
            return result;
        }
    }
}
