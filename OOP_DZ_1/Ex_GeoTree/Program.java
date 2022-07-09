package Ex_GeoTree;

public class Program {
    public static void main(String[] args) {

        Person natasha = new Person("Наташа");
        Person alex = new Person("Саша");
        Person mary = new Person("Маша");
        Person n021 = new Person("Алла");
        Person n022 = new Person("Иван");
        Person n011 = new Person("Валера");

        natasha.appendToFamily(alex);
        natasha.appendToFamily(mary);
        alex.appendToFamily(n011);
        mary.appendToFamily(n021);
        mary.appendToFamily(n022);

        research(natasha, "");
    }

    static void research(Person root, String sp) {
        if (root != null) {
            Printer.outputData(sp + root.toString());
            for (Person item : root.getFamily()) {
                research(item, sp + "  ");
            }
        }
    }
}


