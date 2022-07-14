package Ex2_HumanAndWardrobe;

public class VehicleDoor extends Door {
   
    public DoorType doorType;
    //создаем две двери авто, которые по умолчанию закрыты
    public VehicleDoor(String name) {
        this.doorType = DoorType.VEHICLE;
        setState(State.CLOSED);
        setName(name);
    }
}
