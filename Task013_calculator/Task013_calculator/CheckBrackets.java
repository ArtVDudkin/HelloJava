package Task013_calculator;

import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;

public class CheckBrackets {
    
    public static boolean checkBrackets(String expr) {
        Map<Character, Character> bracketsCheck = new Hashtable<Character, Character>();
        bracketsCheck.put(')', '(');

        Stack<Character> stack = new Stack<Character>();

        for (char ch : expr.toCharArray()) {
            if (bracketsCheck.containsValue(ch)) {
                stack.push(ch);
            } else {
                if (bracketsCheck.containsKey(ch)) {
                    if (stack.isEmpty() || !bracketsCheck.get(ch).equals(stack.pop())) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
