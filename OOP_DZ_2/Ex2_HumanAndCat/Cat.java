package Ex2_HumanAndCat;

public class Cat extends Animal {
    
    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public String listenHuman(String value) {
        StringBuilder res = new StringBuilder();
        res.append(catName + ": ");
        if (value.contains("kis-kis")) {
            res.append(say());
            res.append(act1());
            return res.toString();
        } else if (value.contains(catName)) {
            res.append(sayMur());
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
        return "Meow!";
    }

    public String sayMur() {
        return "Mur-Mur-Mur!";
    }

    @Override
    public String getName() {
        return catName;
    }
}
