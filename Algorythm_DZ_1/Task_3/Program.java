package Algorythm_DZ_1.Task_3;

import java.util.List;

/** 
 * Задача 3
 * Написать алгоритм поиска всех доступных комбинаций для количества кубиков K с количеством граней N.
 * Вариант 1. Количество кубиков строго ограничено (например, 4).
 * Вариант 2. Количество кубиков будет динамическим (K задает пользователь).
 * Определить сложность полученного варианта решения.
*/ 

public class Program {
    
    public static void main(String[] args) {
        int k = 4;                          // число кубиков
        String signs = "123456";            // значения на гранях кубика и их количество
        FindCombo allCombo = new FindCombo();
        allCombo.findCombo(signs, new char[k], 0);
        List<String> comboList = allCombo.showCombo();
        System.out.println(comboList);
        System.out.println("Всего комбинаций: " + comboList.size());
        // Оценка сложности полученного варианта решения О(n^k)  {n в степени k}
    }
}
