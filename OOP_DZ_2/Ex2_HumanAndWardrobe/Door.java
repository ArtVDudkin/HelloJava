package Ex2_HumanAndWardrobe;

public abstract class Door {
    
    public State state;
    public String doorType;

    enum State {
        OPENED, CLOSED
    }

}
