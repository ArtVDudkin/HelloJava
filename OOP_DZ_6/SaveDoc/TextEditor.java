package SaveDoc;

import java.util.Scanner;

public class TextEditor {
    
    public static void run() {
        Doc myDocument = new Doc();                     // Originator
        EditorHistory history = new EditorHistory();    // Caretaker
        
        try (Scanner inp = new Scanner(System.in)) {
            while (true) {
                System.out.println(" 1 - Добавить текст  2 - Сохранить  3 - Отменить изменение  4 - Выход");
                String key = inp.next();
                System.out.println("\033[H\033[J");
                switch (key) {
                    case "1":
                        System.out.println("Введите текст");
                        Scanner scanner = new Scanner(System.in);
                        myDocument.addBlock(scanner.nextLine() + " ");
                        myDocument.setStyle(2);
                        myDocument.print();
                        break;
                    case "2":
                        history.push(myDocument.SaveState());
                        break;
                    case "3":
                        if (!history.isEmpty()) {
                            myDocument.restoreState(history.pop());
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
