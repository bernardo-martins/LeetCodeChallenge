
import java.util.*;

public class Main {

    /*
        Input: n = 12
        Output: true
        Explanation: 12 = 3*1 + 3*2
     */
    public static boolean checkPowersOfThree(int n) {

        Stack<Integer> stack = new Stack<Integer>();



        return Math.log(n) == 3;
    }

    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(3));
    }
}