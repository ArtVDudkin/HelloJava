# `Домашнее задание 1`

## `Задача 1:`

Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
Согласно свойствам линейной сложности, количество итераций цикла будет линейно изменяться относительно размера N.
 * Решение должно иметь сложность О(n).
 * Для решения необходимо воспользоваться циклом.
 
## `Задача 2:`

Написать алгоритм поиска простых чисел (делятся только на себя и на 1) в диапазоне от 1 до N.

В алгоритме будет использоваться вложенный for, что явно говорит о квадратичной сложности.

## `Задача 3:`
 
Написать алгоритм поиска всех доступных комбинаций для количества кубиков K с количеством граней N.
 * Вариант 1. Количество кубиков строго ограничено (например, 4).
 * Вариант 2. Количество кубиков будет динамическим (K задает пользователь).

Определить сложность полученного варианта решения.

## `Задача 4:`

Написать алгоритм поиска нужного числа в последовательности Фибоначчи.

Считаем, что 1е и 2е значения в последовательности равны 1.

Искать будем по формуле F(n) = F(n-1) + F(n-2), что предполагает использование рекурсивного алгоритма.

Рекурсия заканчивается на значениях 1 и 2.

*выполнить данную задачу линейным способом и сравнить время выполнения кода.