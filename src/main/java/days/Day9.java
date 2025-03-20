package days;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Day9 {

    public int climbStairs(int n) {
        //recursive
        if(n <= 2)
            return n;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public int climbStairsDynamicProgramming(int x) {
        if(x<=2)
            return x;
        int[] stairs = new int[x];
        stairs[0] = 1;
        stairs[1] = 2;
        for(int i = 2; i<x; i++)
            stairs[i] = stairs[i-1] + stairs[i-2];
        return stairs[x-1];
    }

    public int mySqrt(int x) {
        return Integer.valueOf((int) Math.sqrt((double)x));
    }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i  = 0 ; i < nums.length; i++) {
            if(!set.add(nums[i])) {
                set.remove(nums[i]);
            }
        }
        return set.iterator().next();
    }
}
