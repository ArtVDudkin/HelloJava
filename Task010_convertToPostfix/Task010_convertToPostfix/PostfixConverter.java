package Task010_convertToPostfix;

import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;

public class PostfixConverter {
    
    public String infixExpr;
    public String postfixExpr; 

    private String prepareString(String expr) {
        String result = expr;
        result = result.replaceAll(" ", "");
        result = result.replaceAll(",", ".");
        result = result.replaceAll("Sin", "S");
        result = result.replaceAll("Cos", "C");
        result = result.replaceAll("Tan", "T");
        result = result.replaceAll("Pi", "3.1415");
        return result;
    }

    public PostfixConverter(String expr) {
        infixExpr = prepareString(expr);
        postfixExpr = toPostfix(infixExpr);
    }

    public String toPostfix(String infixExpr) {
        if (CheckBrackets.checkBrackets(infixExpr)) {
            // Список и приоритет операторов
            Map<Character, Integer> operPriority = new Hashtable<Character, Integer>();
            operPriority.put('(', 0);
            operPriority.put('P', 0);
            operPriority.put('+', 1);
            operPriority.put('-', 1);
            operPriority.put('*', 2);
            operPriority.put('/', 2);
            operPriority.put('^', 3);
            operPriority.put('S', 4);
            operPriority.put('C', 4);
            operPriority.put('T', 4);


            String postfixExpr = "";
            Stack<Character> opStack = new Stack<Character>();

            for (int i = 0; i < infixExpr.length(); i++) {
                Character ch = infixExpr.charAt(i);

                if (Character.isDigit(ch) || ch == '.') {
                    postfixExpr += ch;
                } else if (ch == '(') { 
                    opStack.push(ch);
                } else if (ch == ')') {                                            
                    while (!opStack.isEmpty() && opStack.peek() != '(') {
                        postfixExpr += " " + opStack.pop();
                    }
                    opStack.pop();  // удаляем '('' из стека
                } else if (operPriority.containsKey(ch)) {
                    while (!opStack.isEmpty() && operPriority.get(opStack.peek()) >= operPriority.get(ch)) {                             
                        postfixExpr += " " + opStack.pop();
                    }
                    postfixExpr += " ";
                    opStack.push(ch);
                }
            }
            //	Заносим все оставшиеся операторы из стека в выходную строку
            while (!opStack.isEmpty()) {
                postfixExpr += " " + opStack.pop();
            }
            postfixExpr = postfixExpr.replaceAll("\\s+", " ");
            postfixExpr = postfixExpr.replaceAll("S", "Sin");
            postfixExpr = postfixExpr.replaceAll("C", "Cos");
            postfixExpr = postfixExpr.replaceAll("T", "Tan");
            postfixExpr = postfixExpr.replaceAll("3.1415", "Pi");
            return postfixExpr;
        } else
            return "Ошибка расстановки скобок в исходном выражении!";
    }
}
