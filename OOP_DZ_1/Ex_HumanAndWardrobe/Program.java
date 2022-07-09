package Ex_HumanAndWardrobe;

import Ex_HumanAndWardrobe.WardrobeDoor.State;

public class Program {

        public static void main(String[] args) {

        Human man1 = new Human("Nikolai");
        Human man2 = new Human("Elena");
        
        //создаем две двери шкафа, которые по умолчанию закрыты
        WardrobeDoor door1 = new WardrobeDoor(1, State.CLOSED);
        WardrobeDoor door2 = new WardrobeDoor(2, State.CLOSED);
        
        man1.openDoor(door1);
        man2.openDoor(door2);
        man1.closeDoor(door2);
        man2.closeDoor(door1);
        man1.closeDoor(door1);  // пытаемся закрыть уже закрытую дверь - получаем сообщение, что дверь уже закрыта
    }

}
