package Task013_calculator;

public class Program {

    public static void main(String args[]) {
        //String expr = "3^2/(3*3)+10-2*3";
        //String expr = "2*4 + 2*2";
        //String expr = "(3+3)/(2-2)";
        //String expr = "Sin(0)";
        //String expr = "2*Sin(Pi)";
        String expr = "(2^3 * (10 / (5 - 3)))^(Sin(2*Pi))";
        PostfixConverter postfixConv = new PostfixConverter(expr);
        Calculator clc = new Calculator();
        String postfixExpr = postfixConv.postfixExpr;

        System.out.printf("Infix: %s\n", expr);
        System.out.printf("Postfix: %s\n", postfixExpr);
        System.out.printf("Result: %s\n", clc.calculate(postfixExpr));   
    } 
}
