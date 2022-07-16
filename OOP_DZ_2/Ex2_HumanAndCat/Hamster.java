package Ex2_HumanAndCat;

public class Hamster extends Animal {

    public Hamster(String hamName) {
        super.setName(hamName);
    }

    @Override
    public String listenHuman(String value) {
        StringBuilder res = new StringBuilder();
        res.append(super.getName() + ": ");
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
}
