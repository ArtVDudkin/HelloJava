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
        int value = 500000;                             // наше исходное число N
        SimpleNumbers simple = new SimpleNumbers();

        Date timeStart = new Date();
        List<Integer> myList1 = simple.getSimpleNumbers(value);
        Date timeFinish = new Date();
        System.out.println("Простые числа от 1 до " + value);
        System.out.println(myList1);
        long workTime = timeFinish.getTime() - timeStart.getTime();
        System.out.println("Ticks: " + workTime);       // 7382 ticks for 500.000 numbers 

        timeStart = new Date(); 
        List<Integer> myList2 = simple.getEratosphen(value);
        timeFinish = new Date(); 
        System.out.println("Простые числа от 1 до " + value);
        System.out.println(myList2);
        workTime = timeFinish.getTime() - timeStart.getTime();
        System.out.println("Ticks: " + workTime);       // 10 ticks for 500.000 numbers !!
    }
}
