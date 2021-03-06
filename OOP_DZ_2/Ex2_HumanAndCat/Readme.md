# `Проект Human and Cat`

## `Цели и задачи проекта:`
Подумать как описать логику взаимодействия человека и домашнего питомца. Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. Какое ещё взаимодействие может быть?
Добавить абстракции, нужно гарантированно продумать иерархию компонент и взаимодействия их между собой. 
Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т.е. работаем не с конкретным экземпляром котика, а с интерфейсом “котик”, лучше уйти от взаимодействия с конкретными питомцами и повысить уровень абстракции до взаимодействия с котиком, собачкой или хомяком, т.е. с интерфейсом “животное”

## `Описание проекта:`
Для решения данной задачи код был разделен на несколько компонент: абстрактный класс животное (Animal), классы котик (Cat) и хомячок (Hamster), наследуемые от класса Animal, класс человек, который взаимодействует с животными, класс MyLog, который хранит историю взаимодействия человека с животными, а также компонента Program, в которой описывается некий сценарий взаимодествия человека с животными.

# `Описание работы компонент`
## Компонента Program.java содержит в себе:
1. Точку входа *main(String[] args)*.
2. Пример ситуации, когда человек позвал двух котиков, они откликнулись. Человек добавил их к себе в список. Далее один котик убежал. И вместо него человек добавил к себе в список животных хомячка.

## Компонента Animal.java:
1. Представляет собой абстрактный класс, включающий в себя приватное поле *animalName* (имя животного), методы getName() и setName(String name), которые возвращают и задают имя животного, а также абстрактные методы.
2. `String listenHuman(String value)` - животное слушает, что говорит человек и в зависимости от сказаного может выполнять какие-либо действия, информация о которых возвращается в виде текста.
3. `String say()` возвращает типичный для данного животного звук.
4. `String act1()` возвращает в виде текста некое действие/поведение животного.
5. `String act2()` возвращает в виде текста еще один вариант действия/поведения животного.

## Компонента Cat.java наследуется от абстрактного класса Animal и содержит в себе:
1. Конструктор `Cat(String catName)` для создания экзепляра класса котик в момент вызова конструктора (в качестве параметра методу передается имя животного).
2. Переопределены методы `listenHuman(String value)`, `say()`, `act1()`, `act2()`, описывающие конкретное поведение и действия котика.
3. Метод `String sayMur()` описывает дополнительный звук, характерный для котика.

## Компонента Hamster.java наследуется от абстрактного класса Animal и содержит в себе:
1. Конструктор `Hamster(String hamName)` для создания экзепляра класса хомячок в момент вызова конструктора (в качестве параметра методу передается имя животного).
2. Переопределены методы `listenHuman(String value)`, `say()`, `act1()`, `act2()`, описывающие конкретное поведение и действия хомячка.

## Компонента Human.java содержит в себе:
1. Приватное поле *myPets*  - список животных данного эксземпляра человека.
2. Конструктор `Human()` для создания экземпляра человека.
3. Метод `getMyPets()` возвращает список животных, принадлежащих данному человеку.
4. Метод `void addPet(Animal... args)` добавляет в список животных, принадлежащих данному человеку, всех животных, которые указаны в качестве параметра.
5. Метод `void delPet(Animal pet)` удаляет из списка животных, принадлежащих данному человеку, животное, которые указано в качестве параметра.
6. Метод `String callPet(Animal animal, String value)` описывает ситуацию, когда человек позвал конкретное животное, сказав некоторую фразу.
7. Метод `String callAllPets(String value)` описывает ситуацию, когда человек позвал всех животных.
8. Метод `String touchAnimal(Animal animal)` описывает ситуацию, когда человек погладил животное.

## Компонента MyLog.java содержит в себе:
1. Приватное поле *log* - список (история) всех событий взаимодействия человека и животных.
2. Метод `void append(String event)` добавляет событие в лог.
3. Метод `void viewEvents()` выводит информацию обо всех событиях в консоль.