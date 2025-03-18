import utils.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>(numRows);
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < numRows; i++) {
            list = new ArrayList<Integer>();
            for(int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i)
                    list.add(j,1);
                else
                    list.add(j, pascal.get(i-1).get(j) + pascal.get(i-1).get(j-1));
            }
            pascal.add(list);
        }

        return pascal;
    }


    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        for(List<Integer> l: list) {
            for(Integer i : l) {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}