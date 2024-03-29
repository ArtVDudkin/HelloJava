package Algorythm_DZ_1.Task_1;

/** 
 * Задача 1
 * Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
 * Согласно свойствам линейной сложности, количество итераций цикла будет линейно изменяться 
 * относительно размера N.
 * Решение должно иметь сложность О(n).
 * Для решения необходимо воспользоваться циклом.
 **/ 

public class Program {
    
    public static void main(String[] args) {
        int value = 9;                          // наше исходное число N
        Sum s = new Sum();
        int sum = s.getSum(value);
        System.out.println("Сумма чисел от 1 до " + value + " равна: " + sum);
    }
}
