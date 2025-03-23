package days;

import utils.TreeNode;

public class Day12 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);   // Depth of the left subtree
        int rightDepth = maxDepth(root.right); // Depth of the right subtree
        return Math.max(leftDepth, rightDepth) + 1; // Max depth + 1 for the current node
    }
}
