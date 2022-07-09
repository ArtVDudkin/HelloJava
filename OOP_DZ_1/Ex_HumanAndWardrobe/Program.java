package Ex_HumanAndWardrobe;

import Ex_HumanAndWardrobe.WardrobeDoor.State;

public class Program {

        public static void main(String[] args) {

        Human man1 = new Human("Nikolai");
        Human man2 = new Human("Elena");

        WardrobeDoor door1 = new WardrobeDoor(1, State.Closed);
        WardrobeDoor door2 = new WardrobeDoor(2, State.Closed);
        
        door1.openDoor(man1, 1);
        door2.openDoor(man2, 2);
        door1.closeDoor(man2, 1);
        door2.closeDoor(man1, 2);
        door1.closeDoor(man1, 1);
    }

}
