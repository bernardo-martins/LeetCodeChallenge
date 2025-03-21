package days;

import java.util.HashSet;
import java.util.Set;

public class Day10 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}
