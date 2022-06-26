package Task013_calculator;

import java.util.Stack;

public class Calculator {
    
    private String prepareString(String expr) {
        String result = expr;
        result = result.replaceAll("Pi", "3.1415926535");
        return result;
    }

    public String calculate(String postfixExpr) {
        postfixExpr = prepareString(postfixExpr);
        String[] postfixArr = postfixExpr.split(" ");
        if (postfixArr[0].equals("Ошибка")) {
            return "Ошибка расстановки скобок в исходном выражении!";
        }
        Stack<String> calcStack = new Stack<String>();
        Double value1;
        Double value2;
        for (String item : postfixArr) {
            switch (item) {
                case "+":
                    value1 = Double.valueOf(calcStack.pop());
                    value2 = Double.valueOf(calcStack.pop());
                    calcStack.push(Double.toString(value2 + value1));
                    break;
                case "-":
                    value1 = Double.valueOf(calcStack.pop());
                    value2 = Double.valueOf(calcStack.pop());
                    calcStack.push(Double.toString(value2 - value1));
                    break;
                case "*":
                    value1 = Double.valueOf(calcStack.pop());
                    value2 = Double.valueOf(calcStack.pop());
                    calcStack.push(Double.toString(value2 * value1));
                    break;
                case "/":
                    value1 = Double.valueOf(calcStack.pop());
                    value2 = Double.valueOf(calcStack.pop());
                    if (value1 == 0)
                        return "Ошибка деления на 0!";
                    else
                        calcStack.push(Double.toString(value2 / value1));
                    break;
                case "^":
                    value1 = Double.valueOf(calcStack.pop());
                    value2 = Double.valueOf(calcStack.pop());
                    calcStack.push(Double.toString(Math.pow(value2, value1)));
                    break;
                case "Sin":
                    value1 = Double.valueOf(calcStack.pop());
                    calcStack.push(Double.toString(Math.sin(value1)));
                    break;
                case "Cos":
                    value1 = Double.valueOf(calcStack.pop());
                    calcStack.push(Double.toString(Math.cos(value1)));
                    break;
                case "Tan":
                    value1 = Double.valueOf(calcStack.pop());
                    calcStack.push(Double.toString(Math.tan(value1)));
                    break;
                default:
                    calcStack.push(item);
                    break;
            }
        }
        return calcStack.pop();
    }
}
