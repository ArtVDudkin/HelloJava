# `Проект SaveDoc`

## `Цели и задачи проекта:`
Продемонстрировать пример работы текстового редактора с возможностью сохранения всего состояния документа (текст и условный стиль оформления) и его возврата к выбранному состоянию.

будет ли работать ваш подход, если в системе появится нечто похожее на
class Model {
Model model;
}
## `Описание проекта:`
Для решения данной задачи был применен паттерн [Хранитель](https://ru.wikipedia.org/wiki/%D0%A5%D1%80%D0%B0%D0%BD%D0%B8%D1%82%D0%B5%D0%BB%D1%8C_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)), включающий в себя компоненты: *DocMemento* (в роли memento), *Doc* (в роли originator) и *EditHistory* (в роли caretaker). В компоненте *EditHistory* реализован механизм на основе очереди Deque, позволяющий сохранять новые состояния документа в очередь и переключаться между состояниями как назад для отмены действия пользователя, так и вперед для возврата отмененного действия. При этом количество сохранений состояния документа не ограничено разработчиком (но возможно стоит ограничить количество сохранений состояния документа, например до 16). Также в компоненте *TextEditor* реализован пользовательский интерфейс, позволяющий добавлять текст в документ, отменять последнее действие, возвращать отмененное действие и завершать работу с программой.

# `Описание работы компонент`

## Компонента Doc.java (originator) содержит в себе:
1. Приватные поля *text* и *style* служат для хранения текста и стиля форматирования. Наследуется от абстрактного класса *Model*.
2. `void append(String text)` служит для добавления новых блоков текста и хранения текста в переменной *text*.
3. `void setStyle(int style)` служит для задания условного стиля добавляемого блока текста, задается целочисленным значением по индексу стиля форматирования.
4. `void print()` служит для вывода текста на дисплей.
5. `DocMemento saveState()` служит для создания нового сохранения состояния текста и его стиля форматирования.
6. `void restoreState(DocMemento memento)` служит для восстановления текста и стиля форматирования из передаваемого методу сохраненного состояния *memento*.

## Компонента DocMemento.java (memento, хранитель) содержит в себе:
1. Приватные поля *text* и *style* служат для хранения текста и стиля форматирования.
2. Конструктор `DocMemento(String text, int style)` непосредственно служит для создания нового сохранения состояния текста и его стиля форматирования в момент вызова конструктора.
3. `int getStyle()` возвращает информацию о стиле текста.
4. `String getText()` возвращает текст.

## Компонента EditorHistory.java (caretaker, опекун) содержит в себе:
1. Приватные поля *history* и *idx* служат для хранения очереди сохраненных состояний текста, а также индекса текущего сохраненного состояния.
2. Конструктор `EditorHistory()` служит для создания двусторонней очереди для хранения состояний текста и возможности выбора нужного состояния.
3. `void changeIdx(int value)` служит для изменения индекса текущего сохранения при перемещении между сохраненными состояниями в очереди. В метод передаются значения: 1 для перемещения вперед, -1 для перемещения назад между элементами в очереди.
4. `int getIdx()` возвращает текущий индекс сохранения состояния в очереди.
5. `void addLast(DocMemento memento)` служит для добавления сохранения состояния текста *memento* в конец очереди, при этом индекс текущего сохранения увеличивается на 1. Кроме того, если до момент добавления нового сохраненного состояния производилась отмена действий пользователя, соответствующие сохраненные состояния, хранящиеся в начале очереди, удаляются.
6. `DocMemento undo()` служит для отмены последнего действия пользователя и вызова предыдущего сохранения для восстановления текста. При этом последнее сохранение перемещается в начало очереди для возможности его использования в случае вызова метода DocMemento redo(). Таким образом, метод возвращает предпоследнее состояние текста для восстановления.
7. `DocMemento redo()` служит для возврата последнего отмененного пользователем действия и восстановления текста. Соответствующее последнее изменение переносится из начала очереди в конец и возращается методом для дальнейшего восстановления текста.
8. `int size()` возвращает количество элементов очереди в момент обращения к методу.

## Компонента Model.java содержит в себе:
1. Абстрактные методы *append(String text)*, *print()*, *saveState()*, *restoreState(DocMemento memento)*.

## Компонента Program.java содержит в себе:
1. Точку входа *main(String[] args)*.
2. Вызов метода `TextEditor.run()` для запуска работы текстового редактора.

## Компонента TextEditor.java содержит в себе:
1. Создает экземпляр классов *Doc()* - originator и *EditorHistory()* - caretaker.
2. Интерфейс пользователя, позволяющий:
* добавлять новый блок текста;
* отменять последнее действие (несколько раз);
* возращать отмененное действие;
* завершать работу с программой.