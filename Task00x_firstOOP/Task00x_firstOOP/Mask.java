package Task00x_firstOOP;

public class Mask extends HygieneSup {

    public Mask(String prodName, Double price, Integer quantity, String unitName, Integer qtyInPackage) {
        super(prodName, price, quantity, unitName, qtyInPackage);
    }

    public Mask() {
        this("Товар Noname", 0.00, 0,"none", 0);
    }

}
