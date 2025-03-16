package days;

import utils.TreeNode;

import java.util.Stack;

public class Day5 {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();
        stackP.push(p);
        stackQ.push(q);

        while (!stackP.isEmpty() && !stackQ.isEmpty()) {
            TreeNode nodeP = stackP.pop();
            TreeNode nodeQ = stackQ.pop();

            if (nodeP == null && nodeQ == null) {
                continue;
            }
            if (nodeP == null || nodeQ == null) {
                return false;
            }

            if (nodeP.val != nodeQ.val) {
                return false;
            }

            stackP.push(nodeP.right);
            stackP.push(nodeP.left);
            stackQ.push(nodeQ.right);
            stackQ.push(nodeQ.left);
        }

        // If one stack is empty and the other isn't, the trees are not the same
        return stackP.isEmpty() && stackQ.isEmpty();
    }
}
