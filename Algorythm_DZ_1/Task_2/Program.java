package Algorythm_DZ_1.Task_2;

import java.util.Date;
import java.util.List;

/** 
 * Задача 2
 * Написать алгоритм поиска простых чисел (делятся только на себя и на 1) в диапазоне от 1 до N.
 * В алгоритме будет использоваться вложенный for, что явно говорит о квадратичной сложности.
*/ 

public class Program {
    
    public static void main(String[] args) {
        int value = 500000;                          // наше исходное число N
        Date timeStart = new Date();
        SimpleNumbers simple1 = new SimpleNumbers();
        List<Integer> myList1 = simple1.getSimpleNumbers(value);
        Date timeFinish = new Date();
        System.out.println("Простые числа от 1 до " + value);
        System.out.println(myList1);
        long workTime = timeFinish.getTime() - timeStart.getTime();
        System.out.println("Ticks: " + workTime);       // 7382 ticks for 500.000 numbers 

        SimpleNumbers simple2 = new SimpleNumbers();
        timeStart = new Date(); 
        List<Integer> myList2 = simple2.getEratosphen(value);
        timeFinish = new Date(); 
        System.out.println("Простые числа от 1 до " + value);
        System.out.println(myList2);
        workTime = timeFinish.getTime() - timeStart.getTime();
        System.out.println("Ticks: " + workTime);       // 10 ticks for 500.000 numbers !!
    }
}
