import utils.ListNode;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sums = new Stack<>();
        stack.push(root);
        sums.push(root.val);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int sum = sums.pop();

            if (node.left == null && node.right == null && sum == targetSum) {
                return true;
            }

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

    public static void main(String[] args) {
        TreeNode two = new TreeNode(2,null,null);
        TreeNode seven = new TreeNode(7, null, null);
        TreeNode eleven = new TreeNode(11, seven, two);
        TreeNode four = new TreeNode(4, eleven, null);
        TreeNode eight = new TreeNode(8, new TreeNode(13,null,null), null);
        TreeNode node =
                new TreeNode(5, four, eight);

        boolean result = hasPathSum(node, 22);

    }
}