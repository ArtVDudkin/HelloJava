package Task00x_firstOOP;

public class Pacifier extends BabysProd {

    public Pacifier(String prodName, Double price, Integer quantity, String unitName, Integer ageFrom, String hypoallergenic) {
        super(prodName, price, quantity, unitName, ageFrom, hypoallergenic);
    }

    public Pacifier() {
        this("Товар Noname", 0.00, 0,"none", 0, "None");
    }

}
