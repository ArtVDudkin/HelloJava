package Ex2_HumanAndCat;

public class Program {

        public static void main(String[] args) {
        
        MyLog log = new MyLog();
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murka");
        Human man = new Human();
        log.appendToLog(man.callPet(cat1,"kis-kis"));
        log.appendToLog(cat1.listenHuman(man.callPet(cat1,"kis-kis")));
        log.appendToLog(man.callPet(cat1, "Hello, Barsik!"));
        log.appendToLog(cat1.listenHuman(man.callPet(cat1, "Hello, Barsik!")));
        log.appendToLog(man.touchAnimal(cat1));
        log.appendToLog(cat1.sayMur());
        // добавили котов cat1 и cat2 к человеку в набор животных
        man.addPet(cat1, cat2);
        log.appendToLog(man.callAllPets("Hey pets! Where are you?)"));
        // внезапно cat1 исчез...
        man.delPet(cat1);
        log.appendToLog(man.callAllPets("Hey pets! Where are you?)"));
        // добавили хомяка вместо кота 
        Hamster hams = new Hamster("mr Homa");
        man.addPet(hams);
        log.appendToLog(man.callAllPets("Hey pets! Where are you?)"));
    
        log.viewEvents();
    }

}
