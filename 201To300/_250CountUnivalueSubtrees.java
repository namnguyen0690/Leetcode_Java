package com.nami.solutions.from201to300;

public class _250CountUnivalueSubtrees {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public int countUnivalSubtrees(TreeNode root) {
            isUnival(root, Integer.MAX_VALUE);
            return ans;
        }

        private int ans = 0;

        private boolean isUnival(TreeNode root, int val) {
            if (root == null)
                return true;

            if (isUnival(root.left, root.val) & isUnival(root.right, root.val)) {
                ++ans;
                return root.val == val;
            }

            return false;
        }
    }
}
