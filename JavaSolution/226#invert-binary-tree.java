//https://leetcode.com/problems/invert-binary-tree/

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
    public TreeNode invertTree(TreeNode root) {
    	TreeNode output = root;
    	beginInvert(output);
        return output;
    }

    public void beginInvert(TreeNode root){
    	if (root == null) return;
    	if (root.left != null || root.right != null){
    		TreeNode temp = root.left;
    		root.left = root.right;
    		root.right = temp;
    		beginInvert(root.left);
    		beginInvert(root.right);
    	}
    }
}

/**
Trivia:
This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
*/