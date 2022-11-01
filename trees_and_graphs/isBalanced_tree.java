/*Given a binary tree, determine if it is height-balanced. */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class isBalanced_tree {
  public int getHeight(TreeNode root) {
    if (root == null)
      return 0;
    return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
  }

  public boolean isBalanced(TreeNode root) {

    if (root == null) {
      return true;
    }

    int heightDiff = getHeight(root.left) - getHeight(root.right);

    if (Math.abs(heightDiff) > 1) {
      return false;
    } else {
      return isBalanced(root.left) && isBalanced(root.right);
    }
  }
}