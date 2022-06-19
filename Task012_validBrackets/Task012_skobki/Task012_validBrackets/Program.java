package Task012_validBrackets;

import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;

public class Program {
    
    public static boolean isBracketsValid(String expr) {
         
        Map<Character, Character> brackets = new Hashtable<>();
        brackets.put(')','(');
        brackets.put('}','{');
        brackets.put(']','[');
        brackets.put('>','<'); 
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            if (brackets.containsValue(expr.charAt(i)))
                st.push(expr.charAt(i));
            else {
                if (brackets.containsKey(expr.charAt(i)))
                    if (st.isEmpty() || !brackets.get(expr.charAt(i)).equals(st.pop()))
                        return false;
            }
 
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String expr1 = "a+(d*3)";
        String expr2 = "[a+(1*3)";
        String expr3 = "[6+(3*3)]";
        String expr4 = "{a}[+]{(d*3)}";
        String expr5 = "<{a}+{(d*3)}>";
        String expr6 = "{a+]}{(d*3)}";
        String expr7 = "<{a}+{>(d*3)}";

        System.out.println(expr1 + "\t" + isBracketsValid(expr1));
        System.out.println(expr2 + "\t" + isBracketsValid(expr2));  
        System.out.println(expr3 + "\t" + isBracketsValid(expr3)); 
        System.out.println(expr4 + "\t" + isBracketsValid(expr4));
        System.out.println(expr5 + "\t" + isBracketsValid(expr5));
        System.out.println(expr6 + "\t" + isBracketsValid(expr6));
        System.out.println(expr7 + "\t" + isBracketsValid(expr7));
    }
}

