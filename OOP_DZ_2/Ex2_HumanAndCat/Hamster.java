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
            res.append(say());
            res.append(act1());
            res.append(act2());
            return res.toString();
        } else {
            res.append(say());
            return res.toString();
        }
    }

    @Override
    public String say() {
        return "pi-pi-pi!";
    }

    @Override
    public String getName() {
        return hamsterName;
    }
}
