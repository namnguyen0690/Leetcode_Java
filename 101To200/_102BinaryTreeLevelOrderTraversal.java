package com.nami.solutions.from101to200;

public class _102BinaryTreeLevelOrderTraversal {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            if(root == null) return res;
            queue.offer(root);

            while(!queue.isEmpty()){
                List<Integer> l = new ArrayList<>();
                int stop = queue.size();
                for(int i=0; i< stop; i++){
                    TreeNode node = queue.poll();
                    l.add(node.val);
                    if(node.left != null) queue.offer(node.left);
                    if(node.right != null) queue.offer(node.right);
                }
                res.add(l);
            }

            return res;
        }
    }s
}
