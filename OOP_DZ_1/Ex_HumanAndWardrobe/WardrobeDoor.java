package Ex_HumanAndWardrobe;

public class WardrobeDoor {
    
    public State state;
    public Integer doorIndex;

    public WardrobeDoor(Integer doorIndex, State state) {
        this.state = state;
        this.doorIndex = doorIndex;
    }

    enum State {
        OPENED, CLOSED
    }

}
