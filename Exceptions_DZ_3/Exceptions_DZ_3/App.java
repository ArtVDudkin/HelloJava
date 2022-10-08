package Exceptions_DZ_3;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Exceptions_DZ_3.Note.Gender;

public class App {
    
    public static void start() throws IOException {
        System.out.println("Эта программа умеет записывать и хранить данные обо всех!");
        DataProvider dprov = new DataProvider();
        DataParser dparse = new DataParser(dprov.getData());
        Note nt = new Note();
        nt.setSurname(dparse.getData(0));
        nt.setName(dparse.getData(1));
        nt.setPatronimic(dparse.getData(2));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        nt.setBirthday(LocalDate.parse(dparse.getData(3), df));
        nt.setPhone(Integer.parseInt(dparse.getData(4)));
        nt.setGender(Gender.toGender(dparse.getData(5)));        
        DataSaver ds = new DataSaver();
        ds.save(nt);
        restart();
    }
    
    public static void restart() throws IOException {
        System.out.println("Для ввода новых данных введите 1. Для выхода из программы введите 0.");
        try (Scanner inp = new Scanner(System.in)) {
            String key = inp.next();
            switch (key) {
                case "0":
                    System.exit(0);
                case "1":
                    App.start();
                    break;
                default:
                    System.out.println("Нет такой команды!");
                    restart();
                    break;
            }
        }
    }

}
