# `Проект Human and Wardrobe`

## `Цели и задачи проекта:`
Описать в ООП стиле логику взаимодействия объектов реального мира между собой: шкаф-человек. Какие члены должны быть у каждого из классов (у меня на семинаре студенты пришли к тому, чтобы продумать логику взаимодействия жена разрешает открыть дверцу шкафа мужу, после чего эту дверцу можно открыть)

**Примечание:** на первом этапе студентам сложно применять сразу все концепты ООП, упор делается на инкапсуляцию. Если получится продумать иерархию каких-то компонент - здорово. После первой лекции, они не знают про абстракцию и интерфейсы.

## `Описание проекта:`
Для решения данной задачи код был разделен на несколько компонент: класс дверь шкафа (WardrobeDoor), класс человек (Human), который может открывать и закрывать дверь, а также класс Program, который описывает сценарий взаимодействия человека и шкафа.

# `Описание работы компонент`
## Компонента Program.java содержит в себе:
1. Точку входа *main(String[] args)*.
2. Пример сценария, когда два человека пытаются открывать и закрывать двери шкафа.

## Компонента WardrobeDoor.java и содержит в себе:
1. Конструктор `WardrobeDoor(Integer doorIndex, State state)` для создания экзепляра класса дверь шкафа в момент вызова конструктора. По умолчанию дверь создается с состоянием "Закрыто".
2. Перечисление состояния двери (OPENED, CLOSED).
3. Метод `State getState()` возвращает состояние двери.
4. Метод `void setState(State newState)` задает нвоое состояние двери.
5. Метод `int getDoorIndex() ` возвращает индекс текущего экземпляра двери.

## Компонента Human.java имплементирует интерфейс IDoor, что позволяет человеку управлять состоянием дверей, и содержит в себе:
1. Приватное поле *name*  - имя человека.
2. Конструктор `Human(String name)` для создания экземпляра человека с заданным именем.
3. Метод `void closeDoor(WardrobeDoor door)`, описывающий процедуру закрытия двери.
4. Метод `void openDoor(WardrobeDoor door)`, описывающий процедуру открытия двери. 
 