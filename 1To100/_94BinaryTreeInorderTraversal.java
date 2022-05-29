package com.nami.solutions.from1to100;

public class _94BinaryTreeInorderTraversal {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode node = root;

            while (!stack.isEmpty() || node != null) {
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
                TreeNode top = stack.pop();
                res.add(top.val);
                node = top.right;
            }

            return res;
        }
    }
}
