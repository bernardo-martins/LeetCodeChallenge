package days;

public class Day4 {

    public boolean checkPowersOfThree(int n) {
        if(n == 0)
            return false;
        if(n == (Math.log(n) / Math.log(3)))
            return true;
        int i = 0;
        return false;
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] >= target)
                return i;
        return nums.length;
    }

}
