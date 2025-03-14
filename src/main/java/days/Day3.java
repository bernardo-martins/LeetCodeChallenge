package days;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Day3 {

    public boolean isValid(String s) {
        if(s.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('[',']');
        map.put('(',')');
        map.put('{','}');

        int i = 0;
        Character c = 0, currC = 0, matchedC = 0;
        do {
            c = s.charAt(i);
            if(map.containsKey(c)) {
                currC = c;
                stack.push(currC);
            } else if(!stack.isEmpty()){
                matchedC = map.get(currC);
                if(matchedC == null || !map.get(currC).equals(c))
                    return false;
                stack.pop();
                if(!stack.isEmpty())
                    currC = stack.peek();
            } else {
                return false;
            }
            i++;
        } while(i < s.length());

        return stack.isEmpty();    }
}
