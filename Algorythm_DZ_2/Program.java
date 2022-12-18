package Algorythm_DZ_2;

import java.util.Date;

import Algorythm_DZ_2.Search.BinarySearch;
import Algorythm_DZ_2.Search.Search;
import Algorythm_DZ_2.Sort.BubbleSort;
import Algorythm_DZ_2.Sort.HeapSort;
import Algorythm_DZ_2.Sort.InsertionSort;
import Algorythm_DZ_2.Sort.QuickSort;

public class Program {
    public static void main(String[] args) {
        
        int size = 1000000;
        int maxNumber = 99999;
        int[] arr = new int[size];
        Date timeStart, timeFinish = new Date();
        long workTime = 0;
        FillArray fa = new FillArray(size, maxNumber);
        arr = fa.getArray();
        PrintArray pa = new PrintArray();
        System.out.println("Initial array");
        pa.printArray(arr);

        // Пирамидальная сортировка (сортировка кучей)
        timeStart = new Date();
        new HeapSort().sort(arr);
        timeFinish = new Date(); 
        System.out.println("Sorted array");
        pa.printArray(arr);
        workTime = timeFinish.getTime() - timeStart.getTime();
        System.out.println("Ticks: " + workTime);   // 150-160 ticks for 1.000.000 numbers

        // Быстрая сортировка
        // timeStart = new Date();
        // new QuickSort().sort(arr);
        // timeFinish = new Date();
        // System.out.println("Sorted array");
        // pa.printArray(arr);
        // workTime = timeFinish.getTime() - timeStart.getTime();
        // System.out.println("Ticks: " + workTime);   // 100-120 ticks for 1.000.000 numbers

        // Сортировка вставками
        // timeStart = new Date();
        // new InsertionSort().sort(arr);
        // timeFinish = new Date();
        // System.out.println("Sorted array");
        // pa.printArray(arr);
        // workTime = timeFinish.getTime() - timeStart.getTime();
        // System.out.println("Ticks: " + workTime);   // 539620 ticks for 1.000.000 numbers

        // Сортировка пузырьком
        // timeStart = new Date();
        // new BubbleSort().sort(arr);
        // timeFinish = new Date();
        // System.out.println("Sorted array");
        // pa.printArray(arr);
        // workTime = timeFinish.getTime() - timeStart.getTime();
        // System.out.println("Ticks: " + workTime);   // 1.590.000 ticks for 1.000.000 numbers

        // Бинарный поиск элемента в 1.000.000 массиве
        timeStart = new Date();
        int searchValue = 79001;
        int result = new BinarySearch().find(arr, searchValue);
        timeFinish = new Date();
        System.out.println("Result of search " + searchValue + " : " + result);
        workTime = timeFinish.getTime() - timeStart.getTime();
        System.out.println("Ticks: " + workTime);   // 0-1 tick for 1.000.000 numbers

        // Обычный поиск элемента в 1.000.000 массиве
        timeStart = new Date();
        searchValue = 79002;
        result = new Search().find(arr, searchValue);
        timeFinish = new Date();
        System.out.println("Result of search " + searchValue + " : " + result);
        workTime = timeFinish.getTime() - timeStart.getTime();
        System.out.println("Ticks: " + workTime);   // 3 ticks for 1.000.000 numbers
    }
}
