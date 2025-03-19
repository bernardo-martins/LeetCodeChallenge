package days;

import utils.TreeNode;

import java.util.Stack;

public class Day8 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sums = new Stack<>();
        stack.push(root);
        sums.push(root.val);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int sum = sums.pop();

            if (node.left == null && node.right == null && sum == targetSum)
                return true;

            if (node.right != null) {
                stack.push(node.right);
                sums.push(sum + node.right.val);
            }
            if (node.left != null) {
                stack.push(node.left);
                sums.push(sum + node.left.val);
            }
        }
        return false;
    }
}
