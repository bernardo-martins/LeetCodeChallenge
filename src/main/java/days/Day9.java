package days;

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
}
