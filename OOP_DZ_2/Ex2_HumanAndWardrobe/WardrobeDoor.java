package Ex2_HumanAndWardrobe;

public class WardrobeDoor extends Door {

    //создаем две двери шкафа, которые по умолчанию закрыты
    public WardrobeDoor(String doorType) {
        this.state = state.CLOSED;
        this.doorType = doorType;
    }
}
