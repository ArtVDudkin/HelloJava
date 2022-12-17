package Algorythm_DZ_1.Task_2;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumbers {
    
    private List<Integer> result;
    
    public SimpleNumbers() {
        this.result = new ArrayList<>();
    }

    public List<Integer> getSimpleNumbers(Integer value) {
        this.result.clear();
        boolean simple = true;
        for (int i = 1; i <= value / 2; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if(simple) {
                result.add(i);
            }
        }
        return this.result;
    }

    public List<Integer> getEratosphen(Integer value) {
        this.result.clear();
        int[] arr = new int[value + 1];
        for (int i = 0; i <= value; i++) {      // инициализируем все числа как простое число 1
            arr[i] = 1;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (arr[i] == 1) {                  // проверяет, является ли i простым числом
                for (int j = 2; i * j <= value; j++) {
                    arr[i * j] = 0;             // числа, кратные i, не являются простыми
                }
            }
        }
 
        for (int i = 1; i <= value; i++) {
            if (arr[i] == 1) {
                this.result.add(i);
            }
        }
        return this.result;
    }
}
