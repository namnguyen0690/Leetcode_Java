package com.nami.solutions.from101to200;

public class _144BinaryTreePreorderTraversal {
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            if(root == null) return res;
            stack.push(root);

            while(!stack.isEmpty()){
                TreeNode node = stack.pop();
                res.add(node.val);
                if(node.right != null) stack.push(node.right);
                if(node.left != null) stack.push(node.left);
            }
            return res;
        }
    }
}
