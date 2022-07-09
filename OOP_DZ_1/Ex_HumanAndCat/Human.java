package Ex_HumanAndCat;

public class Human {
    
    public String callCat(String value) {
        return String.format("human: calls cat %s", value);
    }

    public String touchCat() {
        return "human: touch cat";
    }

}
