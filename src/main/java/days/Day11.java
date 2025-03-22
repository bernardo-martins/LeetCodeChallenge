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

    public String reverseVowels(String s) {

        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0, right = s.length()-1;
        while(left < right) {
            while(left<right && vowels.indexOf(chars[left])==-1) {
                left++;
            }
            while(right>left && vowels.indexOf(chars[right])==-1) {
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
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
