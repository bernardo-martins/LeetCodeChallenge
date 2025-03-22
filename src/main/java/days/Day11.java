package days;

import utils.TreeNode;

import java.util.Stack;

public class Day11 {

    public boolean isBalanced(TreeNode root) {

        return true;
    }
    private int getDepth(TreeNode node) {
        return 0;
    }

    public void reverseString(char[] s) {
        char aux = ' ';
        for(int i = 0; i < s.length/2; i++) {
            aux = s[s.length-i-1];
            s[s.length-i-1] = s[i];
            s[i] = aux;
        }
    }
}
