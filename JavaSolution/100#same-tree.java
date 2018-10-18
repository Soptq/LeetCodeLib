//https://leetcode.com/problems/same-tree/submissions/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> s1, s2;
        s1 = new Stack<>();
        s2 = new Stack<>();
        if (p != null) s1.push(p);
        if (q != null) s2.push(q);
        while (!s1.isEmpty() && !s2.isEmpty()) {
            TreeNode n1 = s1.pop();
            TreeNode n2 = s2.pop();
            if (n1.val != n2.val) return false;
            if (n1.right != null) s1.push(n1.right);
            if (n2.right != null) s2.push(n2.right);
            if (s1.size() != s2.size()) return false;
            if (n1.left != null) s1.push(n1.left);
            if (n2.left != null) s2.push(n2.left);
            if (s1.size() != s2.size()) return false;
        }
        return s1.size() == s2.size();
    }   
}