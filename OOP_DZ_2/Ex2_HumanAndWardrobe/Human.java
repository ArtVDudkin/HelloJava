package Ex2_HumanAndWardrobe;

public class Human {
    
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void closeDoor(Door door) {
        
        if (door.state == Door.State.OPENED) {
            door.state = Door.State.CLOSED;
            System.out.printf("%s closed %s\n", name, door.doorType);
        } else {
            System.out.printf("%s tryed to close %s, but it was closed\n", name, door.doorType);
        }
    }

    public void openDoor(Door door) {
        if (door.state == Door.State.CLOSED) {
            door.state = Door.State.OPENED;
            System.out.printf("%s opened %s\n", name, door.doorType);
            
        } else {
            System.out.printf("%s tryed to open %s, but it was closed\n", name, door.doorType);
        }
    }  

}
