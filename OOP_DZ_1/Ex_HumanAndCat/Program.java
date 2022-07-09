package Ex_HumanAndCat;

public class Program {

        public static MyLog log1 = new MyLog();
        public static void main(String[] args) {

        Human man1 = new Human();
        Cat cat1 = new Cat("Barsik");
        log1.appendToLog(man1.callCat("kis-kis"));
        log1.appendToLog(cat1.listenHuman(man1.callCat("kis-kis")));
        log1.appendToLog(man1.callCat("Hello, Barsik!"));
        log1.appendToLog(cat1.listenHuman(man1.callCat("Hello, Barsik!")));
        log1.appendToLog(man1.touchCat());
        log1.appendToLog(cat1.sayMur());
        
        log1.viewEvents();
    }

}
