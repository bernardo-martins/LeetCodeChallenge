import java.util.Stack;

public class Main {

    public static int[] plusOne(int[] digits) {
        boolean isShift = true;
        for (int digit : digits) {
            if (digit != 9) {
                isShift = false;
                break;
            }
        }

        if(isShift) {

            int[] newDigits = new int[digits.length+1];
            newDigits[1] = digits[0];
            digits = newDigits;

            digits[digits.length-2] += 1;
            digits[digits.length-1] = 0;
        } else {
            digits[digits.length-1] += 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9,9};
        int target = 0;
        for(int i : plusOne(nums))
            System.out.print(i);
    }
}