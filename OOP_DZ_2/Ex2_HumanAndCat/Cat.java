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
            res.append(animalVoice());
            res.append(animalReaction1());
            return res.toString();
        } else if (value.contains(catName)) {
            res.append(sayMur());
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
        return "Meow!";
    }

    public String sayMur() {
        return "Mur-Mur-Mur!";
    }

    @Override
    public String getAnimalName() {
        return catName;
    }
}
