package SaveDoc;

import java.util.Scanner;

public class TextEditor {
    
    public static void run() {
        Doc myDocument = new Doc();                     // Originator
        EditorHistory history = new EditorHistory();    // Caretaker
        
        try (Scanner inp = new Scanner(System.in)) {
            while (true) {
                System.out.println(" 1 - append text  2 - save  3 - restore  4 - exit");
                String key = inp.next();
                System.out.println("\033[H\033[J");
                switch (key) {
                    case "1":
                        // создали документ и добавили текст
                        String temp = "";
                        System.out.println("Введите текст");
                        Scanner scanner = new Scanner(System.in);
                        myDocument.addBlock(scanner.nextLine() + " ");
                        myDocument.setStyle(2);
                        myDocument.print();
                        break;
                    case "2":
                        // сохранили документ в стек
                        history.push(myDocument.SaveState());
                        break;
                    case "3":
                        myDocument.restoreState(history.pop());
                        myDocument.print();
                        break;
                    case "4":
                        System.exit(0);
                    default:
                        System.out.println("Нет такой команды");
                        break;
                }
            }
        }
        
        
        // // создали документ и добавили текст
        // myDocument.addBlock("Привет, мир!");
        // myDocument.setStyle(2);
        // myDocument.print();
        // // сохранили документ в стек
        // history.push(myDocument.SaveState());

        // // изменили документ
        // myDocument.addBlock("И снова привет!!!");
        // myDocument.setStyle(3);
        // myDocument.print();
        // // восстановили документ из стека
        // myDocument.restoreState(history.pop());
        // myDocument.print();

    }
}
