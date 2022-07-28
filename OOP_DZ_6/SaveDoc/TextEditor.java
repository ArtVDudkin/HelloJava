package SaveDoc;

import java.util.Scanner;

public class TextEditor {
    
    public static void run() {
        Doc myDocument = new Doc();                     // Originator
        EditorHistory history = new EditorHistory();    // Caretaker
    
        try (Scanner inp = new Scanner(System.in)) {
            while (true) {
                System.out.println(" 1 - Добавить текст  2 - Отменить изменение <-  3 - Вернуть изменение ->  4 - Выход");
                String key = inp.next();
                System.out.println("\033[H\033[J");
                switch (key) {
                    case "1":
                        System.out.println("Введите текст");
                        Scanner scanner = new Scanner(System.in);
                        myDocument.addText(scanner.nextLine() + " ");
                        myDocument.setStyle(2);
                        myDocument.print();
                        history.addLast(myDocument.saveState());
                        break;
                    case "2":
                        if (history.getIdx() > 0) {
                            myDocument.restoreState(history.undo());
                            myDocument.print();
                        }    
                        break;
                    case "3":
                        if (history.getIdx() < history.size() - 1) {
                            myDocument.restoreState(history.redo());
                            myDocument.print();
                        }
                        break;
                    case "4":
                        System.exit(0);
                    default:
                        System.out.println("Нет такой команды");
                        break;
                }
            }
        }

    }
}
