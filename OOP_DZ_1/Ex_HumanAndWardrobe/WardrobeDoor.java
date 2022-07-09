package Ex_HumanAndWardrobe;

public class WardrobeDoor {
    
    public State state;
    public Integer doorIndex;

    public WardrobeDoor(Integer doorIndex, State state) {
        this.state = state;
        this.doorIndex = doorIndex;
    }

    enum State {
        Opened, Closed
    }

    public void closeDoor(Human hm, Integer door) {
        
        if (this.state == State.Opened) {
            this.state = State.Closed;
            System.out.printf("%s closed door #%d\n", hm.name, door);
        } else
            System.out.printf("%s tryed to close door #%d, but it was closed\n", hm.name, door);
    }

    public void openDoor(Human hm, Integer door) {
        if (this.state == State.Closed) {
            this.state = State.Opened;
            System.out.printf("%s opened door #%d\n", hm.name, door);
        } else
            System.out.printf("%s tryed to open door #%d, but it was closed\n", hm.name, door);
        
    }  

}
