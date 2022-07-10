package Ex2_HumanAndWardrobe;

public class Human {
    
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void closeDoor(WardrobeDoor door) {
        
        if (door.state == WardrobeDoor.State.OPENED) {
            door.state = WardrobeDoor.State.CLOSED;
            System.out.printf("%s closed door #%d\n", name, door.doorIndex);
        } else {
            System.out.printf("%s tryed to close door #%d, but it was closed\n", name, door.doorIndex);
        }
    }

    public void openDoor(WardrobeDoor door) {
        if (door.state == WardrobeDoor.State.CLOSED) {
            door.state = WardrobeDoor.State.OPENED;
            System.out.printf("%s opened door #%d\n", name, door.doorIndex);
        } else {
            System.out.printf("%s tryed to open door #%d, but it was closed\n", name, door.doorIndex);
        }
    }  

}
