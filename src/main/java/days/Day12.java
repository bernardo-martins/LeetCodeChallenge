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

    public String addBinary(String a, String b) {
        int resA = 0;
        char[] arrayA = a.toCharArray();
        for(int i = 0; i < arrayA.length; i++) {
            if(arrayA[i] != '0')
                resA+=Math.pow(2,i);
        }

        int resB = 0;
        char[] arrayB = b.toCharArray();
        for(int i = 0; i < arrayB.length; i++) {
            if(arrayB[i] != '0')
                resB+=Math.pow(2,i);
        }
        return Integer.toBinaryString(resA+resB);
    }
}
