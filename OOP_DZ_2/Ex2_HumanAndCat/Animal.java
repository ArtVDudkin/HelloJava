package Ex2_HumanAndCat;

public abstract class Animal {
    
    private String animalName;

    public String listenHuman(String value) {
        return animalName;
    }

    public String animalVoice() {
        return "";
    }

    public String animalReaction1() {
        return "\nlooks at human one time and do nothing...";
    }

    public String animalReaction2() {
        return "\nruns to human and starts to wait something...";
    }

    public String getAnimalName() {
        return animalName;
    }
}
