package days;

public class Day9 {

    public int climbStairs(int n) {
        //recursive
        if(n <= 2)
            return n;
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
