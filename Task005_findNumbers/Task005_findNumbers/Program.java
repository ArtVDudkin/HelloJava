package Task005_findNumbers;

import java.util.ArrayList;

public class Program {
    
    public static String expr;
    public static String q;
    public static String w;
    public static String e;
    public static ArrayList<Integer> listNum1;
    public static ArrayList<Integer> listNum2;
    public static ArrayList<Integer> listSum;


    private static void parseExprToQWE(String expr) {
        String[] elements = expr.split(" ");
        q = elements[0];
        w = elements[2];
        e = elements[4];
    }

    public static ArrayList<Integer> getDigitsQWE(String value) {
        int maxSize = q.length();
        if (w.length() > maxSize)
            maxSize = w.length();
        if (e.length() > maxSize)
            maxSize = e.length();
        ArrayList<Integer> res = new ArrayList<Integer>();
        // если одно из чисел содержит меньше разрядов, чем другие, то добавляем нули в начале, чтобы размерность листов была одинаковой
        for (int i = maxSize - value.length(); i > 0; i--)
            res.add(0);

        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '?')
                res.add(null);        
            else
                res.add(Integer.parseInt(value.substring(i, i + 1)));
        }
        return res;
    }

    // пытаемся восстановить пропущенные разряды в числах там, где это возможно с помощью арифметики
    public static void tryCalc() {
        int digit;
        int size = listNum1.size();
        int mem = 0;
        // просмотр от младших разрядов к старшим
        for (int i = size -1; i >= 0; i--) {
            // если символы пропущены в первом числе q
            if (listNum1.get(i) == null && listNum2.get(i) != null && listSum.get(i) != null) {
                if (listSum.get(i) - listNum2.get(i) < 0) {
                    digit = listSum.get(i) + 10 - listNum2.get(i);
                    if (listSum.get(i -1) != null) 
                        listSum.set(i -1, listSum.get(i -1) -1); 
                } else
                    digit = listSum.get(i) - listNum2.get(i);
                
                listNum1.set(i, digit);     
                q = replaceChar(q, Character.forDigit(digit,10), i);
            }    
            
            // если символы пропущены во втором числе w
            if (listNum1.get(i) != null && listNum2.get(i) == null && listSum.get(i) != null) {
                if (listSum.get(i) - listNum1.get(i) < 0) {
                    digit = listSum.get(i) + 10 - listNum1.get(i);
                    if (listSum.get(i -1) != null) 
                        listSum.set(i -1, listSum.get(i -1) -1); 
                } else
                    digit = listSum.get(i) - listNum1.get(i);
                listNum2.set(i, digit);
                w = replaceChar(w, Character.forDigit(digit,10), i);         
            }

            // если символы пропущены в сумме е
            if (listNum1.get(i) != null && listNum2.get(i) != null && listSum.get(i) == null) {
                digit = listNum1.get(i) + listNum2.get(i) + mem;
                if (digit > 9) {
                    digit = digit % 10;
                    mem = 1;
                } else  
                    mem = 0;
                listSum.set(i, digit);
                e = replaceChar(e, Character.forDigit(digit,10), i);
            }    
        }
    }
    
    // заменяет символ в строке на найденное значение разряда числа
    public static String replaceChar(String str, char ch, int index) {
        return str.substring(0, index) + ch + str.substring(index+1);
    }

    public static Integer countX (String expr) { 
        int count = 0;
        for (int i = 0; i < expr.length(); i++)
            if (expr.charAt(i) == '?')
                count++;
        return count; 
    }

    public static Boolean checkEquation(String item1, String item2, String answer) {
        int num1 = Integer.parseInt(item1);
        int num2 = Integer.parseInt(item2);
        int res = Integer.parseInt(answer);
        return num1 + num2 == res;
    }

    public static ArrayList<String> findNums(String value) {
        ArrayList<String> res = new ArrayList<String>();
        int coeffArrSize = countX(expr);                        // определяем, сколько '?' осталось
        int[] coeffArr = new int[coeffArrSize];                 // массив для хранения коэффициентов, которые подставляем в expr
        int maxCount = (int)Math.pow(10, coeffArrSize);
        int[] indexArr = new int[coeffArrSize];
        int k = 0;                                              // запоминаем индексы, где пропущены разряды в expr
        for (int i = 0; i < expr.length(); i++) {                                 
            if (expr.charAt(i) == '?') {
                indexArr[k] = i;
                k++;
            }
        }
        
        for (int i = 0; i < maxCount; i++) {
            String temp_str = expr;
            int temp = i;
            for (int j = coeffArrSize -1; j >= 0; j--) {
                coeffArr[j] = temp % 10;
                temp /= 10;
                temp_str = replaceChar(temp_str, Character.forDigit(coeffArr[j],10), indexArr[j]);
                //System.out.println(temp_str);
                parseExprToQWE(temp_str);
                
                // if (checkEquation(q, w, e)) {
                //     System.out.println(q + " + " + w + " = " + e);
                //     res.add(q + " + " + w + " = " + e);
                // }
            }

        }
        return res;
    }

    
    public static void main(String[] args) {
        //expr = "2? + ?5 = 69";
        //expr = "?7 + ?5 = 8?";
        //expr = "?271 + 351 = 8???";
        //expr = "???? + 351 = 7411";
        //expr = "351 + ???? = 7411";
        expr = "?5? + ?5 = ?80";

        System.out.println(expr);
        parseExprToQWE(expr);
        listNum1 = getDigitsQWE(q);
        listNum2 = getDigitsQWE(w);
        listSum = getDigitsQWE(e);
        tryCalc();
        
        expr = q + " + " + w + " = " + e; 
        if (countX(expr) == 0) {
            System.out.println(expr);
        } else {
            ArrayList<String> result = findNums(expr);
            if (result.isEmpty())
                System.out.println("Решений нет");    
            else   
                for(var item : result)
                    System.out.println(item);
        }                            
    }
}
