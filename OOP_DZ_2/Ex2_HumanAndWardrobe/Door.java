package Ex2_HumanAndWardrobe;

public abstract class Door {
    
    private String name;
    private State state;
    
    public enum DoorType {
        VEHICLE, WARDROBE; 
    }

    public enum State {
        OPENED, CLOSED
    }

    public State getState() {
        return this.state;
    }

    public void setState(State newState) {
        state = newState;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String doorName) {
        name = doorName;
    }
}
