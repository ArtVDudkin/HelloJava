package Ex2_HumanAndCat;

public abstract class Animal {
    
    private String animalName;

    public String listenHuman(String value) {
        return animalName;
    }

    public String say() {
        return new String();
    }

    // act1 и act2 - базовые реакции животного, которые в дальнейшем могут остаться такими же, 
    // а могут быть переопределены по-другому 
    public String act1() {
        return "\nlooks at human one time and do nothing...";
    }

    public String act2() {
        return "\nruns to human and starts to wait something...";
    }

    public String getName() {
        return animalName;
    }
}
