package Task00x_firstOOP;

public class Lemonade extends Drink {

    public Lemonade(String prodName, Double price, Integer quantity, String unitName, Double drinkVolume) {
        super(prodName, price, quantity, unitName, drinkVolume);
    }

    public Lemonade() {
        this("Товар Noname", 0.00, 0,"none", 0.00);
    }

}
