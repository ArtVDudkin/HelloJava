package Ex2_HumanAndCat;

public class Hamster extends Animal {
    
    private String hamsterName;

    public Hamster(String hamName) {
        this.hamsterName = hamName;
    }

    @Override
    public String listenHuman(String value) {
        StringBuilder res = new StringBuilder();
        res.append(hamsterName + ": ");
        if (value.contains("Homa")) {
            res.append(animalVoice());
            res.append(animalReaction1());
            res.append(animalReaction2());
            return res.toString();
        } else {
            res.append(animalVoice());
            return res.toString();
        }
    }

    @Override
    public String animalVoice() {
        return "pi-pi-pi!";
    }

    @Override
    public String getAnimalName() {
        return hamsterName;
    }
}
