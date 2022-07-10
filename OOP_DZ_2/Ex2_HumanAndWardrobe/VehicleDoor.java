package Ex2_HumanAndWardrobe;

public class VehicleDoor extends Door{
    
    //создаем две двери авто, которые по умолчанию закрыты
    public VehicleDoor(String doorType) {
        this.state = state.CLOSED;
        this.doorType = doorType;
    }
}
