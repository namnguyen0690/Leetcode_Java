package com.nami.solutions.from101to200;

public class _145BinaryTreePostorderTraversal {
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            if(root == null) return res;
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode node = stack.pop();
                res.add(node.val);
                if(node.left != null) stack.push(node.left);
                if(node.right != null) stack.push(node.right);
            }
            Collections.reverse(res);
            return res;
        }
    }
}
