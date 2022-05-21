package com.nami.solutions.from1to100;

public class _4MedianOfTwoSortedArrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            // Lengths of two arrays
            int m = nums1.length;
            int n = nums2.length;
            // Check if num1 is smaller than num2
            // If not, then we will swap num1 with num2
            if (m > n) {
                return findMedianSortedArrays(nums2, nums1);
            }
            int start = 0;
            int end = m;
            int realMid = (n + m + 1) / 2;
            while (start <= end) {
                int mid = (start + end) / 2;
                int leftASize = mid;
                int leftBSize = realMid - mid;
                int leftA = (leftASize > 0) ? nums1[leftASize - 1] : Integer.MIN_VALUE;
                int rightA = (leftASize < m) ? nums1[leftASize] : Integer.MAX_VALUE;
                int leftB = (leftBSize > 0) ? nums2[leftBSize - 1] : Integer.MIN_VALUE;
                int rightB = (leftBSize < n) ? nums2[leftBSize] : Integer.MAX_VALUE;
                if (leftA <= rightB && leftB <= rightA) {
                    if ((m + n) % 2 == 0)
                        return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                    return (Math.max(leftA, leftB));
                } else if (leftA > rightB) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return 0.0;
        }
    }
}
