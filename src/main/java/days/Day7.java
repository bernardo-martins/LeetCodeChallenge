package days;

import java.util.ArrayList;
import java.util.List;

public class Day7 {

    public List<List<Integer>> generate(int numRows) {
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

}
