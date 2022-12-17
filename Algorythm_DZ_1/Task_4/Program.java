package Algorythm_DZ_1.Task_4;

import java.util.Date;

/** 
 * Задача 4
 * Написать алгоритм поиска нужного числа в последовательности Фибоначчи.
 * Считаем, что 1е и 2е значения в последовательности равны 1.
 * Искать будем по формуле F(n) = F(n-1) + F(n-2), что предполагает использование рекурсивного алгоритма.
 * Рекурсия заканчивается на значениях 1 и 2.
*/ 

public class Program {
    
    public static void main(String[] args) {
        int num = 50;
        
        Date timeStart = new Date();  
        long res = fiboRecursion(num);
        Date timeFinish = new Date(); 
        System.out.println("By recursion: " + res);
        long workTime = timeFinish.getTime() - timeStart.getTime();
        System.out.println("Ticks: " + workTime);
        // для получения 50-го числа в последовательности Фибоначчи рекурсией прошло 31146 тиков

        timeStart = new Date();
        res = fiboLinear(num);
        timeFinish = new Date(); 
        System.out.println("By linear algorythm: " + res);
        workTime = timeFinish.getTime() - timeStart.getTime();
        System.out.println("Ticks: " + workTime);
        // для получения 50-го числа в последовательности Фибоначчи линейным методом прошло 0 тиков
    }

    // Оценка сложности рекурсивного варианта решения О(2^k)  {2 в степени k}
    public static long fiboRecursion(int num) {
        if(num <= 2) {
            return 1;
        }
        return fiboRecursion(num -1 ) + fiboRecursion(num - 2);
    }

    // Оценка сложности линейного варианта решения О(n)
    public static long fiboLinear(int num) {
        if(num <= 2) {
            return 1;
        }
        final long[] numbers = new long[num];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        return numbers[num-1];
    }
}
